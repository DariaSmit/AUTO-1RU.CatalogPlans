   # Проект сайта catalog-plans.ru


   <img src="https://user-images.githubusercontent.com/110921807/188607913-6d833978-86f5-4435-88b0-ae6aa12e5e47.png" width="90%">

## Содержание 
* Инструменты 
* Реализованные проверки 
* Jenkins сборка
* Allure репорт
* Allure TestOPs
* Запуск с терминала
* Отчет в telegram
* Видео прохождения тестов


-------
## Инструменты 
<img src="https://user-images.githubusercontent.com/110921807/187623033-dce99ef4-26a4-47cd-aa9d-ec01d9bc9d56.svg" width="5%"> <img src="https://user-images.githubusercontent.com/110921807/187623016-1959e45a-cd38-4084-a1f4-d4ea912c2c5a.svg" width=5%> 
<img src="https://user-images.githubusercontent.com/110921807/187625426-975b6eb1-7fde-4475-bb16-59a51b6a0d07.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625436-a436ed9b-c5f8-4e87-b454-56c4e31d8564.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625449-0537214e-69f9-467d-9ec3-e6f78a2f307e.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625466-15575481-05fd-4285-b0e5-8915e90ed0f0.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625496-a1154ac3-2ce5-4049-a181-9d5551affd1a.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625377-57d552a4-69c6-402d-a727-a7656d88e2a3.svg" width="5%">
<img src="https://user-images.githubusercontent.com/110921807/187625412-958b9fcc-1758-4c0a-92f4-0beaaf9a2985.svg" width="5%">
<img src="(https://user-images.githubusercontent.com/110921807/187625393-371c23e5-3f77-4cd4-ab6e-3ec2c7a687ef.svg" width="5%">
-------
## Реализованные проверки
- Проверка заголовков
- Проверка Telegram ссылки
- Проверка VKontakte ссылки
- Проверка поиска

-------
# Jenkins сборка
<img src="https://user-images.githubusercontent.com/110921807/188609504-395a9d25-d76a-4250-918c-594530835edf.png" width="60%">

[Ссылка на сборку](https://jenkins.autotests.cloud/job/AUTO-1RU.CatalogPlans/)


# Allure репорт
<img src="https://user-images.githubusercontent.com/110921807/188611466-dcd567ed-45a2-4380-b8af-a1b01479d2fd.png" width="60%">

# Allure TestOPs

<img src="https://user-images.githubusercontent.com/110921807/188611649-4fd2ed6b-74e8-4add-ba14-d8994d9191f9.png" width="60%">

# Запуск с терминала
локальный запуск:
```bash
gradle clean test
```

Удаленный запуск:
```bash
clean
test
 -Dbrowser=${BROWSER}
 -DbrowserVersion=${BROWSER_VERSION}
 -DbrowserSize=${BROWSER_SIZE}
 -Dremote=${REMOTE}
```
# Отчет в telegram

<img src="https://user-images.githubusercontent.com/110921807/188612133-585fdb69-95d1-4292-a388-7f73dc91267a.png" width="60%">

# Видео прохождения тестов


https://user-images.githubusercontent.com/110921807/188612467-9397127f-b29c-4c1d-bb21-911cef55e65c.mp4



:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
