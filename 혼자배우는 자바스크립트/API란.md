# API
## 1. API란?
Application Programming Interface(API)
&#58; 프론트엔드와 백엔드가 소통할 때 사용하는 언어 (api 양식으로 데이터 주고받음)

## 2. API 문서 읽기
[뉴스캐처](https://docs.newscatcherapi.com/api-docs/endpoints/search-news)   
### 1. API 가져올 주소
```
https://api.newscatcherapi.com/v2/search?q=Apple&from=2021/12/15&countries=CA&page_size=1
```
#### 엔드포인트
프론트엔드가 백엔드에 어떤 정보를 요청할 때 그게 어떤 종류의 정보인지 구분하는 역할을 한다.
- __/search?__
- /latest_headlines?
- /sources? 

위와 같이 사용하고자 하는 정보에 따라 endpoint가 다름. 여기서는 /search?q=~~~에 대해서만 공부해본다.

#### 쿼리
/search? 다음에 `q=Apple&from=2021/12/15&countries=CA&page_size=1`라고 나오는데 이건 쿼리다. API 문서에 쿼리에 사용된 변수들에 대해 설명하는 부분이 있으니 그걸 읽으면서 알아가면 된다. 
- `q=Apple`: Apple에 대해 찾아봄 (쿼리에서 가장 중요한 부분)
- `from=2021/12/15`: 2021/12/15일자 기사부터 찾아봄. (아무것도 입력 안하면-default- 저번주부터 찾기 시작함)
- `countries=CA`: new publisher가 위치한 국가 (캐나다)
- `page_size=1`
	- page size: 한 번에 받을 데이터의 갯수(한번에 몇십만건을 받을 수는 없기 때문..)
	- page size = 1: 한번에 데이터를 한 건만 받겠다!
	- `page`: 총 페이지의 수
- 조건들은 `&`로 연결한다.

#### 헤더(Header)
 <img src = "https://i.esdrop.com/d/f/Hn3cQpRVXY/3DefpZSocw.jpg">     
 요청에도 Header와 Body가 있음. 헤더에는 요청 관련 정보가 들어있고 바디에는 요청 내용이 들어가있음. html 생각하면 됨. 
 
 -  `x-api-key`: (string) Your unique authentication token
	 - api제공사가 api 요청인 각각에게 유니크한 키값을 줌. 그걸로 본인인증(?)을 하는것
 
#### 요청이 성공하면 받아오는 데이터 (예시)
```
{
    "status": "ok",
    "total_hits": 7471,
    "page": 1,
    "total_pages": 7471,
    "page_size": 1,
    "articles": [
        {
            "title": "Is an Apple Music Subscription Worth It?",
            "author": "Shujaa Imran",
            "published_date": "2022-02-03 16:53:12",
            "published_date_precision": "full",
            "link": "https://www.makeuseof.com/apple-music-subscription-worth-it",
            "clean_url": "makeuseof.com",
            "excerpt": "Thinking of subscribing to Apple Music? Here's how to know if it's worth it for you.",
            "summary": "Since its launch in June 2015, Apple Music has been growing steadily. Because of its easy integration across Apple devices, many Apple users are fond of the streaming service. However, how does Apple Music stack up compared to the other streaming services out there? Does it justify a $9.99 subscription per month? We'll break down all the details for you, so you can decide whether an Apple Music subscription is truly worth it. What Is Apple Music?\nApple Music is the Apple's music streaming service, which allows subscribers to access millions of content for a subscription fee. With over 90 million songs, Apple Music content can either be streamed online or downloaded to your device for offline listening. \n\nConsidering Apple was late to the streaming market, its music streaming service has performed well. While Apple hasn't released any official figures, reports say that Apple Music had over 523 million subscribers by the end of 2021.\nAccording to Midia Research, Apple Music achieved a market share of 15% in 2021. In comparison, Spotify came at first place and captured 31% of the global streaming market in the same year. An Apple Music subscription combines subscription-based music streaming with global radio-like programming. With this, purchasing a subscription doesn't just unlock Apple Music's extensive 90-million song library for you to use. Apple Music also lets you watch music videos without ads, access a few podcasts, listen to its curated playlists, and tune into Apple Music's radio stations.\nApple's main radio offering, Apple Music 1, features an around-the-clock worldwide live broadcast from DJs based in Los Angeles, New York, and London. Other radio stations include Apple Music Hits, which play everyone's favorite songs from the '80s, '90s, and 2000s, and Apple Music Country, which features country music. Which Devices Does Apple Music Work on?\nApple Music is primarily available in the Music app on all iPhones, iPads, and iPod Touch models running iOS 8.4 or later. Aside from this, Apple Music is also available on PC (iTunes app), Mac (Music app), Apple TV, and Apple Watch. Apple Music is also available on non-Apple devices, such as Android phones, smart TVs, streaming boxes, and even game consoles. Alternatively, you can also access Apple Music online at music.apple.com.\nWhen using Apple Music, you can choose to either stream everything directly from the internet or download it onto your device for offline listening. If you're concerned about data usage, or you'll mostly be in an area without a good wireless connection, offline listening is a great feature. However, it could be an issue if you're already running low on storage space on your device.\nSimilar to other streaming services, you don't own the music files downloaded from Apple Music. With this, you won't be able to offload them anywhere else, burn them onto a disk, or use them in separate video projects. So, if you decide to cancel your Apple Music subscription, you'll lose access to your library. The Benefits of Apple Music\nApple Music works across different platforms including Android. However, its primary advantage is that it's integrated into Apple's ecosystem—meaning you can easily listen to your collection on your iPhone, iPad, Mac, and even Apple Watch.\nIn addition, Apple Music also features high-quality audio playback for audiophiles. For those who enjoy quality streaming, Apple Music offers Lossless, Hi-Res Lossless, Dolby Atmos, and Spatial Audio content, which arrived in June 2021.\nApart from your personal music library, Apple Music can help you enhance your collection with a mix of old and new tracks, along with Apple Music's three live radio stations. You can also stream TV shows, podcasts, music videos, and over 30,000 expertly curated playlists. The Drawbacks of Apple Music\nApple Music's main competitor, Spotify, also offers a robust streaming experience. A key drawback of Apple Music is that it doesn't offer a free version, whereas Spotify does, albeit with ads. Comparatively, Spotify also has a more extensive library than Apple Music, and offers better social media integration. Although, Apple Music still has better integration with the Apple ecosystem, and its content library is increasing every day.\nWhile Apple Music also includes podcasts, they're few and far in between. So, if you're looking for a way to listen to podcasts, Apple Podcasts has a much bigger and organized library. How Much Does Apple Music Cost?\nDepending on your needs, Apple Music operates as a subscription-based service and has different plans available. The basic monthly subscription is $10, which is the same as Spotify Premium and Tidal HiFi.\nAlternatively, you can pay an annual fee of $99. Other plans include a student subscription for $5 per month and a family plan that can be shared between six people for $15 per month. Apple also offers the Apple Music Voice Plan, which is available for $5 per month. The catch—you can only use Siri to verbally request songs, and the service is streaming only. With Apple Music Voice Plan, you can't use the app, download songs, use the Lyrics view, or access Apple's full Lossless audio and Dolby Atmos catalog. Does Apple Music Offer a Free Trial?\nUsually, Apple Music offers a 3-month trial for users looking to try out the subscription, after which it reverts to $9.99 per month. However, while there is no way to use Apple Music for free forever, there are a ton of ways to get it free for longer.\nWith free trials, you can choose to try out the service before you commit to a subscription. If you're not sold on Apple Music, you can simply cancel the trial before it expires. Gone are the times of playing music using CDs—digital music streaming is the new thing. While there are multiple streaming services to pick from, there's no doubt that Apple Music is worth considering.\nIf you own an Apple device, and you're actively looking to get a subscription for your music needs, we'd recommend giving Apple Music a try. In true Apple fashion, Apple Music makes things much easier for a variety of reasons. However, once you get tied into the ecosystem, it can become difficult to escape from. \n How to Get Started Using Apple Music Playlists In this article, we explore how to create, populate, share, discover, and become a master of Apple Music playlists. Related Topics Entertainment IPhone Media Streaming Apple Apple Music \n About The Author Shujaa Imran (54 Articles Published) More From Shujaa Imran Join our newsletter for tech tips, reviews, free ebooks, and exclusive deals!",
            "rights": "makeuseof.com",
            "rank": 1729,
            "topic": "news",
            "country": "CA",
            "language": "en",
            "authors": [
                "Shujaa Imran"
            ],
            "media": "https://static1.makeuseofimages.com/wordpress/wp-content/uploads/2022/02/thomas-kolnowski-uY-9Dyz8PPM-unsplash-2-1.jpg",
            "is_opinion": false,
            "twitter_account": "@MUO_official",
            "_score": 11.035287,
            "_id": "1017cfad154df78ba22b6b358d672e1f"
        }
    ],
    "user_input": {
        "q": "Apple",
        "search_in": [
            "title_summary"
        ],
        "lang": null,
        "not_lang": null,
        "countries": [
            "CA"
        ],
        "not_countries": null,
        "from": "2021-12-15 00:00:00",
        "to": null,
        "ranked_only": "True",
        "from_rank": null,
        "to_rank": null,
        "sort_by": "relevancy",
        "page": 1,
        "size": 1,
        "sources": null,
        "not_sources": null,
        "topic": null,
        "published_date_precision": null
    }
}
```

## 3. API 호출하는 도구: Postman
### 1. API 키 가져오기
- `/newscatcher`에 로그인 한 후 key 가져오기: Ti97npC1fqIJ5h_9RcQTcU-Koe4A0Sus3gi2kZmzCD4
- Postman 프로그램 이용하기
#### Postman 이용법
<img src = "https://i.esdrop.com/d/f/Hn3cQpRVXY/pAt7mn2cZn.jpg">
<img src = "https://i.esdrop.com/d/f/Hn3cQpRVXY/SWP2A1z0mX.jpg">    

- 1, 2, 3: workspace 새로 만들기
- 4: api 가져올 사이트 주소 입력 (GET으로 해야함)
- 5. Authorization창의 key, value에  (ex.`x-api-key`)와 Sign up(Log in)할 때 미리 얻어둔 키값()을 입력한다.
- 이제 사이트 url 또는 Params 탭의 key, value값에 적당히 찾고 싶은 정보(ex. countries=KR&topic=politics&page_size=10 등)를 입력한다.
- 마지막으로 send 누르면 데이터(객체)들이 리스트로 묶여서 전달된다. 
