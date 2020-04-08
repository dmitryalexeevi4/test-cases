# language: ru
@all
@autoruTest
Функционал: Авто.ру

  Структура сценария: Действия на сайте
    Когда пользователь входит на сайт "https://auto.ru/"
    Тогда открывается страница, в названии которой содержится "Авто.ру"
    * закрываем модальное окно
    * запоминаем количество автомобилей марки <Марка>
    Затем пользователь переходит на страницу с объявлениями по марке <Марка>
    Тогда открывается страница, в названии которой содержится "Купить <Марка>"
    * сверяем текущее количество машин с количеством машин на главной страницы
    * сохраняем количество объявлений конкретной модели <Модель>
    Затем пользователь переходит на страницу с объявлениями по модели <Модель>
    * сверяем текущее количество машин с количеством машин на странице марки

    Примеры:
      | Марка      | Модель  |
      | Ford       | Escape  |
      | Mitsubishi | Lancer  |