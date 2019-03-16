 Polynomial_Arithmetic
 Projede Nodeları eklemek ve yazdırmak için şöyle bir yöntem kullanıldı;
 Node Classının içinde Node türünde değişkenler tutuldu. Bu değişkenler;
 -nodeNext :  LinkedList'in her Node unda linkedList özelliği bulundurmanın(LinkedList of LinkedList) yasak olması sebeyile aynı kuvvet değerine sahip notlar arasında aşağı doğru ekleme çıkarma ve yazdırma işlemleri için kullanıldı.
 -ListNext; LinkedList te farklı kuvvete sahip nodelar üzerinde yanyana ekleme, toplama vb işlemler için kullanıldı.
 -nodeTmp: aynı kuvvete sahip olan nodelar alt alta eklendiğinde en alttaki noda erişimi sağlayacak olan hatırlatıcı node olarak kullanıldı. İlk değer olarak her zaman ait olduğu node değerini gösterirken bir sonraki node un null olup olmama durumuna göre ekleme yazdırma yapılmsına yarayan bir özellik oldu.
