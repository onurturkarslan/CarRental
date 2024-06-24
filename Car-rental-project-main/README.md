# Araç Kiralama Projesi

Bu proje, Java ve Swing teknolojilerini kullanarak masaüstü bir araç kiralama uygulaması geliştirmeyi amaçlar. Proje, veritabanı işlemlerini ve kullanıcı arayüzü geliştirmeyi pratik etmenizi sağlar.

## Proje İçeriği

### Genel Amaç

Araç kiralama projesinin amacı, firmadaki tüm araçların sisteme kaydedilmesi, plaka bilgilerinin tutulması, belirli kriterlere göre uygun ve müsait araçların listelenmesi ve rezervasyon işlemlerinin yapılmasını sağlamaktır.

### Özellikler

1. **Araç Yönetimi:**
    - Araç ekleme, güncelleme ve silme işlemleri.
    - Araçların marka, model, plaka, renk, kilometre, yakıt türü, vites türü gibi bilgilerini yönetme.

2. **Model ve Marka Yönetimi:**
    - Araç modelleri ve markalarının eklenmesi, güncellenmesi ve silinmesi.
    - Modellerin tip, yakıt türü, vites türü, üretim yılı gibi bilgilerini yönetme.

3. **Rezervasyon Yönetimi:**
    - Araç rezervasyonlarının yapılması, güncellenmesi ve iptali.
    - Belirli tarihler arasında araçların müsaitlik durumlarını kontrol etme.
    - Kullanıcı bilgilerini (isim, TC kimlik numarası, telefon numarası, e-posta) kaydetme.

4. **Arama ve Filtreleme:**
    - Belirli kriterlere göre (marka, model, yakıt türü, vites türü, tip) araç arama ve filtreleme.
    - Plaka bilgisine göre araç arama.

## Proje Yapısı

Proje genel olarak dört ana modülden oluşur:

### Entity Modülü

- Veritabanı tablolarını ve bu tablolara ait varlık nesnelerini tanımlar.
- Kullanıcı, marka, model, araç, rezervasyon gibi temel entity nesnelerini içerir.
- Bu nesneler arasındaki ilişkileri belirler.

### DAO (Data Access Object) Modülü

- Veritabanı erişimi ve işlemleri için bir arayüz sağlar.
- Entity modülündeki nesnelerin veritabanına kaydedilmesi, güncellenmesi ve silinmesi süreçlerini yönetir.
- Veritabanından veri alma işlemlerini gerçekleştirir.

### Business Modülü

- İş mantığını yönetir ve uygulama içindeki temel işlemleri gerçekleştirir.
- Fiyatlandırma ve araç kiralama hesaplamaları gibi iş mantığı operasyonlarını yönetir.
- Veritabanı işlemleri için DAO modülü ile etkileşime girer.

### View Modülü

- Kullanıcı arayüzünü (UI) yönetir ve kullanıcıyla etkileşimi sağlar.
- Araç listesi ve kiralama ekranı gibi kullanıcı bilgilerini gösterir.
- Kullanıcının girdiği bilgileri iş katmanına ileterek işlemleri başlatır.

## Veritabanı Kurulumu

Projeyi çalıştırmadan önce PostgreSQL veritabanınızı kurmanız gerekmektedir. Aşağıdaki adımları izleyerek veritabanını oluşturabilirsiniz:

### Gereksinimler

- PostgreSQL'in yüklü olması
- `rentacarDatabase.sql` dosyasının mevcut olması

### Adımlar

1. **PostgreSQL'i Başlatın:**

   PostgreSQL sunucusunun çalıştığından emin olun.

2. **Yeni Bir Veritabanı Oluşturun:**

   PostgreSQL terminal veya pgAdmin gibi bir araç kullanarak yeni bir veritabanı oluşturun. Örneğin:

   ```sh
   CREATE DATABASE rentacar;
   
3. **Veri Tabanının Projeye Bağlanması:**

     Proje içinde veritabanı bağlantı ayarlarını yapın. Db sınıfında gerekli bağlantı ayarlarını yaparken dikkatli olmalısınız.