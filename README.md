# Javarush Telegram Bot
![87- Converted](https://user-images.githubusercontent.com/16310793/103351456-2861af00-4a58-11eb-9a64-1f69eff0631a.jpg)

JavaRush Telegram bot from community for community. Written by developers, who learned in [Javarush](https://javarush.ru).
## Idea
The main idea is to show how to create real application, which can be used by someone else. 
There are [set of articles](https://javarush.ru/groups/posts/2935-java-proekt-ot-a-do-ja-pishem-realjhnihy-proekt-dlja-portfolio), which are describing step by step guidelines of how it was created.
## MVP Scope
As a user, I want to subscribe on group of articles and get notification via telegram-bot every time, 
when new article, related to group subscriptions, has come.

# How it would work 
Based on MVP Scope, we can specify next behaviours (here and after Telegram User, which is using JavaRush Telgegram bot will call User):
- User can subscribe on group of articles
- User can view list of gorup subscriptions on which user subscribes
- User can unsubscribe from gorup of articles
- User can set an inactive bot and do not receive notifications
- User can restart gettting notifications
## Find new articles workflow
The workflow of finding new articles and send them to subscribers can be viewed here:
![Find_New_Articles_WF](https://user-images.githubusercontent.com/16310793/103340221-62bb5400-4a38-11eb-947f-c28ce8ecad1b.png)

# Technological stack
- SpringBoot as a skeleton framework
- Spring Scheduler as a task manager
- MySQL database as a database for saving user and subscription info
- Flyway database migration tool
- Telegram-bot SpringBoot starter
- Spring Data starter
- Unirest - lib for working with REST calls

## Code of Conduct
Please, follow [Code of Conduct](CODE_OF_CONDUCT.md) page.

## License
This project is Apache License 2.0 - see the [LICENSE](LICENSE) file for details

# Contributions
Feel free to suggest new features via [github issue](https://github.com/javarushcommunity/javarush-telegrambot/issues/new).
Note, that new features must be approved before start implement it to avoid the situation, when the time was spent, but the changes wouldn't added to the project.