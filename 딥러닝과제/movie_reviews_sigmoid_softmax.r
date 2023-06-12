library(keras)
imdb <- dataset_imdb(num_words = 10000)
c(c(train_data, train_labels), c(test_data, test_labels)) %<-% imdb 

## 2. preparing the data - turn the lists into tensors 
vectorize_sequences <- function(sequences, dimension = 10000) {
  results <- matrix(0, nrow = length(sequences), ncol = dimension)
  for (i in 1:length(sequences)) {
    valid_indices <- sequences[[i]][sequences[[i]] > 2] 
    results[i, valid_indices] <- 1
  }
  results
}

x_train <- vectorize_sequences(train_data)
x_test <- vectorize_sequences(test_data)

y_train <- as.numeric(train_labels)
y_test <- as.numeric(test_labels)


## 3-1. Build a network (relu, sigmoid)
model_sigmoid <- keras_model_sequential() %>%
  layer_dense(units = 16, activation = "relu", input_shape = c(10000)) %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 1, activation = "sigmoid")
model_sigmoid %>% compile(
  optimizer = "rmsprop",
  loss = "binary_crossentropy",
  metrics = c("accuracy")
)


## 4. Validation
val_indices <- 1:10000
x_val <- x_train[val_indices,]
partial_x_train <- x_train[-val_indices,]
y_val <- y_train[val_indices]
partial_y_train <- y_train[-val_indices]

### train the network for epoch = 20, batch size = 512로 train하기 (loss monitoring 함)
history <- model_sigmoid %>% fit(
  partial_x_train,
  partial_y_train,
  epochs = 20,
  batch_size = 512,
  validation_data = list(x_val, y_val)
)
plot(history)

### reset the model and train with epoch = 4
model_sigmoid <- keras_model_sequential() %>%
  layer_dense(units = 16, activation = "relu", input_shape = c(10000)) %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 1, activation = "sigmoid")
model_sigmoid %>% compile(
  optimizer = "rmsprop",
  loss = "binary_crossentropy",
  metrics = c("accuracy")
)
model_sigmoid %>% fit(x_train, y_train, epoch = 4, batch_size = 512)
results <- model_sigmoid %>% evaluate(x_test, y_test)
results


## 5. Prediction
model_sigmoid %>% predict(x_test[1:10,])

#####################################################################################
## 3-2. Build a network2 (relu, softmax)
model_softmax <- keras_model_sequential() %>%
  layer_dense(units = 16, activation = "relu", input_shape = c(10000)) %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 1, activation = "softmax")
model_softmax %>% compile(
  optimizer = "rmsprop",
  loss = "binary_crossentropy",
  metrics = c("accuracy")
)

### train the network for epoch = 20, batch size = 512
history_2 <- model_softmax %>% fit(
  partial_x_train,
  partial_y_train,
  epochs = 20,
  batch_size = 512,
  validation_data = list(x_val, y_val)
)
plot(history_2)

### reset the model and train with epoch = 4
model_softmax <- keras_model_sequential() %>%
  layer_dense(units = 16, activation = "relu", input_shape = c(10000)) %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 1, activation = "softmax")
model_softmax %>% compile(
  optimizer = "rmsprop",
  loss = "binary_crossentropy",
  metrics = c("accuracy")
)
model_softmax %>% fit(x_train, y_train, epoch = 4, batch_size = 512)
results_2 <- model_softmax %>% evaluate(x_test, y_test)
results_2 


##Prediction
model_softmax %>% predict(x_test[1:10,])

###################################################################
#softmax model: hidden layer = 4
model_softmax_4 <- keras_model_sequential() %>%
  layer_dense(units = 16, activation = "relu", input_shape = c(10000)) %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 1, activation = "softmax")
model_softmax_4 %>% compile(
  optimizer = "rmsprop",
  loss = "binary_crossentropy",
  metrics = c("accuracy")
)

history_3 <- model_softmax_4 %>% fit(
  partial_x_train,
  partial_y_train,
  epochs = 20,
  batch_size = 512,
  validation_data = list(x_val, y_val)
)
plot(history_3)

### reset the model and train with epoch = 4
model_softmax_4 <- keras_model_sequential() %>%
  layer_dense(units = 16, activation = "relu", input_shape = c(10000)) %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 16, activation = "relu") %>%
  layer_dense(units = 1, activation = "softmax")
model_softmax_4 %>% compile(
  optimizer = "rmsprop",
  loss = "binary_crossentropy",
  metrics = c("accuracy")
)
model_softmax_4 %>% fit(x_train, y_train, epoch = 4, batch_size = 512)
results_3 <- model_softmax_4 %>% evaluate(x_test, y_test)
results_3 


##Prediction
model_softmax %>% predict(x_test[1:10,])

