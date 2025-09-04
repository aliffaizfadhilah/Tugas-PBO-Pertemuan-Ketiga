# Tugas-PBO-Pertemuan-Ketiga
 Penerapan Abstrak Class, Overload  serta Override dan Implementasi pada Pemrograman Berorientasi  Obyek
# Abstrak Class
 Abstract class adalah jenis kelas dalam Java yang tidak bisa dibuat objeknya 
secara langsung. Di dalamnya biasanya terdapat satu atau lebih abstract method 
yaitu method yang hanya ditulis deklarasinya tanpa isi. Meski begitu, abstract class 
juga bisa memiliki atribut dan method yang sudah lengkap implementasinya.
# Perbedaan Abstrak Class dan Interface 
 Interface digunakan untuk menetapkan aturan atau perilaku yang harus dimiliki 
oleh kelas yang mengikutinya.Satu kelas bisa mengikuti banyak interface sekaligus, 
karena interface hanya berisi implementasi method tanpa isi. Ini berbeda dengan 
abstract class, di mana satu kelas hanya bisa mewarisi satu abstract class saja.
# Langkah-langkah Pembuatan Project dengan Abstrack Class dan Interface
 1. Buat Package bernama AbstrakdanInterface
 2. Buat Abstrak Class Hewan dengan atribut nama dan umur, konstruktor, method abstrak makanan(), dan method info()
 3. Buat Buat class Mamalia yang extends Hewan dengan method abstrak Spesies() dan method menyusui().
 4. Buat class Laut yang extends Mamalia dengan method abstrak habitat() dan method bernafas()
 5. Buat Tiga Interface bernama UkuranTubuh, Karakteristik dan Keunikan dengan Dua Method di dalam masing-masing interface
 6. Buat Concrete Class LumbaLumba yang extends Laut dan implements UkuranTubuh, Karakteristik, Keunikan.
 7. Buat Main Class serta buat objek dan panggil semua method yang sudah dibuat
# Overload 
 Overload terjadi saat sebuah kelas punya beberapa metode dengan nama yang 
sama, tapi parameter yang berbeda baik dari segi jumlah maupun jenis tipe 
datanya. 
# Override 
 Override terjadi saat sebuah kelas turunan (subclass) menulis ulang metode 
yang sudah ada di kelas induknya (superclass). 
# Langkah-langkah Pembuatan Project dengan Overload dan Override
 1. Buat Package bernama OverloadOverride
 2. Buat Class Overload bernama Perpustakaan dengan beberapa method sama, tapi parameter berbeda
 3. Buat Class Override bernama PerpustakaanDigital yang extends dengan Class Perpustakaan ambahkan method dengan nama dan parameter sama seperti di Perpustakaan, lalu gunakan @Override dan ubah isi method agar output berbeda
 4. Buat class MainClass, buat objek Perpustakaan dan PerpustakaanDigital didalamnya dan panggil semua method untuk melihat perbedaan output antara overload dan override.
