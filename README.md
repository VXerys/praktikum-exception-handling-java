# 🚨 Praktikum Exception Handling - Java

## 👨‍💻 Informasi Mahasiswa
- **Nama**: M. Sechan Alfarisi
- **Kelas**: TI23A  
- **NIM**: 20230040094

---

## 📋 Daftar Isi

- [🚨 Praktikum Exception Handling - Java](#-praktikum-exception-handling---java)
  - [👨‍💻 Informasi Mahasiswa](#-informasi-mahasiswa)
  - [📋 Daftar Isi](#-daftar-isi)
  - [📝 Pendahuluan](#-pendahuluan)
  - [🔬 Hasil Analisis Percobaan](#-hasil-analisis-percobaan)
    - [🔴 Percobaan 1: ArrayIndexOutOfBoundsException](#-percobaan-1-arrayindexoutofboundsexception)
      - [Kode Awal](#kode-awal)
      - [Kode Perbaikan](#kode-perbaikan)
      - [Masalah Awal](#masalah-awal)
      - [Solusi](#solusi)
      - [Analisis Konsep](#analisis-konsep)
    - [🔄 Percobaan 2: Loop dengan ArrayIndexOutOfBoundsException](#-percobaan-2-loop-dengan-arrayindexoutofboundsexception)
      - [Kode Awal](#kode-awal-1)
      - [Kode Perbaikan](#kode-perbaikan-1)
      - [Masalah Awal](#masalah-awal-1)
      - [Solusi](#solusi-1)
      - [Analisis Konsep](#analisis-konsep-1)
    - [➗ Percobaan 3: ArithmeticException - Pembagian dengan Nol](#-percobaan-3-arithmeticexception---pembagian-dengan-nol)
      - [Kode Awal](#kode-awal-2)
      - [Kode Perbaikan (Versi 1)](#kode-perbaikan-versi-1)
      - [Kode Perbaikan (Versi 2)](#kode-perbaikan-versi-2)
      - [Masalah Awal](#masalah-awal-2)
      - [Solusi](#solusi-2)
      - [Analisis Konsep](#analisis-konsep-2)
    - [🔀 Percobaan 4: Multiple Exception dalam Satu Try Block](#-percobaan-4-multiple-exception-dalam-satu-try-block)
      - [Kode Awal](#kode-awal-3)
      - [Kode Perbaikan](#kode-perbaikan-2)
      - [Masalah Awal](#masalah-awal-3)
      - [Solusi](#solusi-3)
      - [Analisis Konsep](#analisis-konsep-3)
    - [🔍 Percobaan 5: Metode untuk Mendapatkan Informasi Exception](#-percobaan-5-metode-untuk-mendapatkan-informasi-exception)
      - [Masalah dan Analisis](#masalah-dan-analisis)
      - [Analisis Konsep](#analisis-konsep-4)
    - [🎯 Percobaan 6: Menggunakan Kata Kunci `throw`](#-percobaan-6-menggunakan-kata-kunci-throw)
      - [Analisis Konsep](#analisis-konsep-5)
    - [🏗️ Percobaan 7: Membuat dan Melempar Exception Custom](#️-percobaan-7-membuat-dan-melempar-exception-custom)
      - [Analisis Konsep](#analisis-konsep-6)
    - [📤 Percobaan 8: Kata Kunci `throws` dan `finally`](#-percobaan-8-kata-kunci-throws-dan-finally)
      - [Kode dengan throws (Versi 1)](#kode-dengan-throws-versi-1)
      - [Kode dengan try-catch-finally (Versi 2)](#kode-dengan-try-catch-finally-versi-2)
      - [Analisis Konsep](#analisis-konsep-7)
    - [🔄 Percobaan 9: Exception Propagation](#-percobaan-9-exception-propagation)
      - [Analisis Konsep](#analisis-konsep-8)
    - [💾 Percobaan 10: IOException dengan File Operations](#-percobaan-10-ioexception-dengan-file-operations)
      - [Analisis Konsep](#analisis-konsep-9)
    - [🏷️ Percobaan 11: Custom Exception Class (extends Throwable)](#️-percobaan-11-custom-exception-class-extends-throwable)
      - [Analisis Konsep](#analisis-konsep-10)
    - [🏷️ Percobaan 11: Custom Exception Class (extends Throwable)](#️-percobaan-11-custom-exception-class-extends-throwable-1)
      - [Masalah dan Analisis](#masalah-dan-analisis-1)
      - [Solusi](#solusi-4)
      - [Analisis Konsep](#analisis-konsep-11)
    - [🎨 Percobaan 12: Custom Exception Class (extends Exception)](#-percobaan-12-custom-exception-class-extends-exception)
      - [Masalah dan Analisis](#masalah-dan-analisis-2)
      - [Solusi](#solusi-5)
      - [Analisis Konsep](#analisis-konsep-12)
  - [🎯 Kesimpulan](#-kesimpulan)

---

## 📝 Pendahuluan

Repository ini berisi hasil praktikum dalam mempelajari penanganan kesalahan (exception handling) pada bahasa pemrograman Java. Exception handling merupakan mekanisme fundamental dalam Java yang memungkinkan program untuk menangani error dan kondisi tidak normal secara elegan, tanpa menyebabkan program berhenti secara mendadak.

Tujuan utama praktikum ini adalah memahami cara kerja mekanisme penanganan error menggunakan blok `try-catch`, `finally`, serta kata kunci `throw` dan `throws`. Melalui 12 percobaan yang dilakukan, konsep-konsep penting seperti hierarki exception, exception propagation, dan custom exception dapat dipahami dengan baik.

Exception handling bukan hanya tentang mencegah program crash, tetapi juga tentang membuat aplikasi yang robust, user-friendly, dan mudah di-debug. Dengan memahami berbagai jenis exception dan cara penanganannya, pengembang dapat membuat program yang lebih reliable dan professional.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

## 🔬 Hasil Analisis Percobaan

### 🔴 Percobaan 1: ArrayIndexOutOfBoundsException

#### Kode Awal

```java
public class Exception {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[5]=100;
    }
}
```

#### Kode Perbaikan

```java
public class Exception {
    public static void main(String[] args) {
        int a[]=new int[5];
        try
        {
            a[5]=100;
        }
        catch(Exception e)
        {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}
```

#### Masalah Awal

Pada kode pertama, program mencoba mengakses elemen array dengan indeks yang melebihi ukuran array yang telah dideklarasikan. Array `a` memiliki ukuran 5, yang berarti indeks valid adalah 0 hingga 4. Ketika program mencoba mengakses indeks ke-5 (`a[5]=100`), Java akan melempar `ArrayIndexOutOfBoundsException` karena indeks tersebut tidak tersedia.

#### Solusi

Solusi yang diterapkan adalah membungkus operasi yang berpotensi menimbulkan error ke dalam blok `try-catch`. Ketika exception terjadi, alur program akan melompat ke blok catch dan menampilkan pesan "Terjadi pelanggaran memory", sehingga program tidak berhenti secara paksa.

#### Analisis Konsep

ArrayIndexOutOfBoundsException merupakan runtime exception yang terjadi ketika program mencoba mengakses elemen array di luar batas yang valid. Java melakukan bound checking pada array untuk mencegah akses memori yang tidak valid, yang merupakan fitur keamanan penting. Dengan menggunakan try-catch, prinsip defensive programming dapat diterapkan untuk membuat program lebih robust dan memberikan feedback yang bermakna kepada pengguna ketika terjadi error.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🔄 Percobaan 2: Loop dengan ArrayIndexOutOfBoundsException

#### Kode Awal

```java
public class Exception2 {
    public static void main(String[] args) {
        int i=0;
        String greeting[]={
            "Hello World!",
            "No, I mean it!",
            "Hello World"
        };
        while(i<4)
        {
            System.out.println(greeting[i]);
            i++;
        }
    }
}
```

#### Kode Perbaikan

```java
public class Exception2 {
    public static void main(String[] args) {
        int i=0;
        String greetings[]={
            "Hello World!",
            "No,I mean it!",
            "HELLO WORLD!"
        };
        while(i<4)
        {
            try
            {
                System.out.println(greetings[i]);
                i++;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Resetting index value");
                i=0;
            }
        }
    }
}
```

#### Masalah Awal

Program menggunakan loop while yang akan berjalan 4 kali (kondisi `i<4`), namun array `greeting` hanya memiliki 3 elemen dengan indeks 0, 1, dan 2. Pada iterasi keempat ketika `i=3`, program akan mencoba mengakses `greeting[3]` yang tidak ada, sehingga terjadi ArrayIndexOutOfBoundsException.

#### Solusi

Kode perbaikan menempatkan operasi print dan increment dalam blok try-catch. Ketika exception terjadi (saat mencoba mengakses indeks yang tidak valid), program akan menangkap ArrayIndexOutOfBoundsException, menampilkan pesan "Resetting index value", dan mengatur ulang nilai `i` menjadi 0. Ini menyebabkan loop akan mulai dari awal lagi.

#### Analisis Konsep

Percobaan ini menunjukkan bagaimana exception handling dapat digunakan sebagai mekanisme recovery dari error. Namun, perlu dipahami bahwa dari perspektif best practice programming, sebenarnya lebih ideal untuk memperbaiki kondisi loop agar tidak melebihi batas array (misalnya menggunakan `i < greeting.length`). Exception handling sebaiknya digunakan untuk situasi yang benar-benar exceptional dan tidak dapat diprediksi, bukan untuk mengontrol alur program normal. Pendekatan ini juga menunjukkan konsep penting bahwa ketika exception ditangkap, program dapat melanjutkan eksekusi daripada berhenti.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### ➗ Percobaan 3: ArithmeticException - Pembagian dengan Nol

#### Kode Awal

```java
public class Exception3 {
    public static void main(String[] args) {
        int bil=10;
        System.out.println(bil/0);
    }
}
```

#### Kode Perbaikan (Versi 1)

```java
public class Exception3 {
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
```

#### Kode Perbaikan (Versi 2)

```java
public class CobaException3 {
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Terjadi Aritmatika error");
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
```

#### Masalah Awal

Program melakukan operasi pembagian dengan nol (`bil/0`), yang merupakan operasi matematika yang tidak valid. Dalam Java, operasi pembagian bilangan bulat dengan nol akan menghasilkan ArithmeticException.

#### Solusi

Dua variasi solusi diterapkan. Versi pertama menggunakan catch block umum dengan Exception class, yang akan menangkap semua jenis exception. Versi kedua menggunakan pendekatan yang lebih spesifik dengan multiple catch blocks, di mana ArithmeticException ditangani secara khusus terlebih dahulu, kemudian diikuti dengan catch Exception sebagai fallback untuk exception lain yang mungkin terjadi.

#### Analisis Konsep

Percobaan ini mendemonstrasikan konsep penting tentang hierarki exception handling. ArithmeticException adalah subclass dari RuntimeException, yang merupakan subclass dari Exception. Penggunaan multiple catch blocks menunjukkan bagaimana Java memproses exception handling secara berurutan dari yang paling spesifik ke yang paling umum. Ketika exception terjadi, Java akan mencari catch block pertama yang sesuai dengan tipe exception yang dilempar. Pendekatan ini memungkinkan pemberian response yang lebih tepat dan informatif sesuai dengan jenis error yang terjadi, yang sangat berguna untuk debugging dan user experience.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🔀 Percobaan 4: Multiple Exception dalam Satu Try Block

#### Kode Awal

```java
public class CobaException4 {
    public static void main(String[] args) {
        int bil=10;
        String b[]={"a","b","c"};
        try
        {
            System.out.println(b[3]);
            System.out.println(bil/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Terjadi Aritmatika error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Melebihi jumlah array");
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
```

#### Kode Perbaikan

```java
public class CobaException4 {
    public static void main(String[] args) {
        int bil=10;
        String b[]={"a","b","c"};
        try
        {
            System.out.println(bil/0);
            System.out.println(b[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Terjadi Aritmatika error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Melebihi jumlah array");
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
```

#### Masalah Awal

Program memiliki dua operasi yang berpotensi menimbulkan error yang berbeda: akses array di luar batas (`b[3]` pada array dengan 3 elemen) dan pembagian dengan nol (`bil/0`). Pada kode awal, akses array dilakukan terlebih dahulu, sehingga ArrayIndexOutOfBoundsException akan terjadi dan operasi pembagian tidak akan pernah dieksekusi.

#### Solusi

Kode perbaikan mengubah urutan eksekusi dengan menempatkan operasi pembagian dengan nol terlebih dahulu. Ini mendemonstrasikan bagaimana urutan statement dalam try block mempengaruhi exception mana yang akan terjadi pertama kali.

#### Analisis Konsep

Konsep fundamental yang ditunjukkan di sini adalah tentang flow control dalam exception handling. Ketika exception terjadi di dalam try block, eksekusi langsung berhenti dan melompat ke catch block yang sesuai. Statement-statement setelah baris yang menimbulkan exception tidak akan pernah dieksekusi. Ini menunjukkan pentingnya memahami bahwa hanya satu exception yang dapat terjadi dalam satu eksekusi try block, meskipun ada multiple catch blocks yang tersedia. Urutan penempatan statement dalam try block menjadi krusial karena menentukan exception mana yang akan diprioritaskan. Konsep ini juga mengajarkan pentingnya perencanaan dalam struktur exception handling untuk memastikan semua kemungkinan error dapat ditangani dengan tepat.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🔍 Percobaan 5: Metode untuk Mendapatkan Informasi Exception

```java
public class Exception5 {
    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Pesan error: ");
            System.out.println(e.getMessage());
            System.out.println("Info stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
```

#### Masalah dan Analisis

Percobaan ini fokus pada eksplorasi berbagai metode yang tersedia pada objek Exception untuk mendapatkan informasi detail tentang error yang terjadi. Program sengaja menimbulkan ArithmeticException melalui pembagian dengan nol, kemudian menggunakan berbagai metode untuk menampilkan informasi error.

#### Analisis Konsep

Exception object dalam Java menyediakan beberapa metode penting untuk debugging dan troubleshooting. Metode `getMessage()` mengembalikan pesan singkat yang menjelaskan penyebab exception, biasanya dalam format yang mudah dipahami pengguna. Metode `printStackTrace()` menampilkan stack trace lengkap yang menunjukkan alur pemanggilan method yang mengarah ke exception, sangat berguna untuk debugging karena menunjukkan lokasi exact di mana error terjadi.

Perbedaan antara `printStackTrace()` dan `printStackTrace(System.out)` terletak pada output stream yang digunakan. Versi tanpa parameter mengirim output ke System.err (standard error stream), sementara versi dengan parameter System.out mengirim ke standard output stream. Ini penting dalam konteks logging dan debugging, karena error stream biasanya ditangani secara terpisah dan dapat di-redirect untuk logging purposes.

Informasi-informasi ini sangat berharga dalam pengembangan aplikasi profesional, karena memungkinkan developer untuk dengan cepat mengidentifikasi dan memperbaiki masalah yang terjadi dalam production environment.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🎯 Percobaan 6: Menggunakan Kata Kunci `throw`

```java
public class ThrowExample {
    static void demo()
    {
        NullPointerException t;
        t=new NullPointerException("Coba Throw");
        throw t;
        // Baris ini tidak lagi dikerjakan;
        System.out.println("Ini tidak lagi dicetak");
    }
    public static void main(String[] args) {
        try
        {
            demo();
            System.out.println("Selesai");
        }
        catch(NullPointerException e)
        {
            System.out.println("Ada pesan error: "+e);
        }
    }
}
```

#### Analisis Konsep

Percobaan ini mendemonstrasikan penggunaan kata kunci `throw` untuk secara manual melempar exception. Berbeda dengan situasi sebelumnya di mana exception terjadi secara otomatis karena kondisi error (seperti pembagian dengan nol), di sini exception dibuat dan dilempar secara eksplisit oleh programmer.

Dalam method `demo()`, sebuah objek NullPointerException dibuat dengan pesan custom "Coba Throw", kemudian dilempar menggunakan statement `throw`. Ketika statement throw dieksekusi, kontrol program langsung berpindah ke exception handler yang sesuai, dan semua statement setelah throw tidak akan pernah dieksekusi. Ini menjelaskan mengapa `System.out.println("Ini tidak lagi dicetak")` tidak akan pernah dijalankan.

Exception yang dilempar dari method `demo()` kemudian ditangkap dalam method `main()` menggunakan try-catch block. Konsep ini menunjukkan bagaimana exception dapat dipropagasi dari satu method ke method lain, yang merupakan mekanisme penting dalam desain aplikasi yang terstruktur.

Penggunaan throw secara manual berguna dalam situasi di mana programmer ingin menerapkan validasi bisnis logic atau kondisi khusus yang memerlukan penanganan exception, meskipun secara teknis tidak terjadi error sistem.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🏗️ Percobaan 7: Membuat dan Melempar Exception Custom

```java
public class ThrowExample2 {
    public static void main(String[] args) {
        try
        {
            throw new Exception("Here's my Exception");
        }
        catch(Exception e)
        {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():"+e.getMessage());
            System.out.println("e.toString():"+e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}
```

#### Analisis Konsep

Percobaan ini menunjukkan cara membuat dan melempar exception dengan pesan custom, serta eksplorasi lebih mendalam tentang berbagai metode yang tersedia untuk mendapatkan informasi dari exception object. Program secara langsung membuat instance dari Exception class dengan pesan "Here's my Exception" dan langsung melemparnya dalam try block yang sama.

Aspek menarik dari percobaan ini adalah demonstrasi perbedaan antara berbagai metode informasi exception. Metode `getMessage()` mengembalikan hanya pesan yang diberikan saat konstruksi exception. Metode `toString()` mengembalikan informasi yang lebih lengkap, termasuk nama class exception dan pesannya dalam format "ClassName: message". Sementara `printStackTrace()` memberikan informasi paling komprehensif dengan menampilkan complete stack trace yang menunjukkan sequence of method calls yang mengarah ke exception.

Pola ini sangat berguna dalam aplikasi nyata di mana developer perlu memberikan informasi error yang meaningful kepada pengguna akhir (menggunakan getMessage()) sambil tetap menyimpan informasi teknis yang detail untuk keperluan debugging (menggunakan toString() dan printStackTrace()). Fleksibilitas dalam memberikan custom message juga memungkinkan aplikasi untuk memberikan konteks yang spesifik tentang kondisi error yang terjadi.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 📤 Percobaan 8: Kata Kunci `throws` dan `finally`

#### Kode dengan throws (Versi 1)

```java
import java.io.*;
public class Test3 {
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB() throws IOException
    {
        System.out.println(20/0);
        System.out.println("Method B");
    }
}
class Utama
{
    public static void main(String[] args) throws IOException
    {
        Test3 c=new Test3();
        c.methodA();
        c.methodB();
    }
}
```

#### Kode dengan try-catch-finally (Versi 2)

```java
class Utama
{
    public static void main(String[] args)
    {
        Test3 o=new Test3();
        o.methodA();
        try
        {
            o.methodB();
        }
        catch(Exception e)
        {
            System.out.println("Error di Method B");
        }
        finally
        {
            System.out.println("Ini selalu dicetak");
        };
    }
}
```

#### Analisis Konsep

Percobaan ini mendemonstrasikan dua pendekatan berbeda dalam menangani exception: menggunakan kata kunci `throws` untuk mendelegasikan penanganan exception ke method pemanggil, versus menangani exception secara langsung menggunakan try-catch-finally.

Dalam versi pertama, method `methodB()` dideklarasikan dengan `throws IOException`, yang berarti method ini berpotensi melempar IOException dan tanggung jawab untuk menanganinya diserahkan kepada method yang memanggilnya. Menariknya, dalam implementasi sebenarnya, `methodB()` malah menghasilkan ArithmeticException (karena pembagian dengan nol), bukan IOException. Ini menunjukkan bahwa deklarasi throws tidak harus sesuai persis dengan exception yang benar-benar terjadi.

Versi kedua menunjukkan pendekatan yang lebih komprehensif dengan menggunakan try-catch-finally. Blok `finally` merupakan fitur penting dalam exception handling karena kode di dalamnya akan selalu dieksekusi, baik exception terjadi maupun tidak. Ini menjadikan finally block ideal untuk cleanup operations seperti menutup file, database connections, atau resource lain yang perlu dibersihkan terlepas dari apakah operasi berhasil atau gagal.

Perbedaan filosofis antara kedua pendekatan ini adalah tentang separation of concerns: throws memungkinkan method untuk fokus pada logic utamanya sambil mendelegasikan error handling ke level yang lebih tinggi, sementara try-catch-finally menangani error secara lokal dan memastikan cleanup selalu dilakukan.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🔄 Percobaan 9: Exception Propagation

```java
class Propagate {
    public static void main(String[] args)
    {
        try
        {
            System.out.println(reverse("This is a string"));
        }
        catch(Exception e)
        {
            System.out.println("The String was blank");
        }
        finally
        {
            System.out.println("All done");
        }
    }
    public static String reverse(String s) throws Exception
    {
        if(s.length()==0)
        {
            throw new Exception();
        }
        String reverseStr = "";
        for(int i=s.length()-1 ; i>=0 ; --i){
            reverseStr+=s.charAt(i);
        }
        return reverseStr;
    }
}
```

#### Analisis Konsep

Percobaan ini mengilustrasikan konsep exception propagation, yaitu bagaimana exception dapat berpindah dari method yang dipanggil ke method pemanggil melalui call stack. Method `reverse()` dideklarasikan dengan `throws Exception`, yang berarti ia dapat melempar exception yang harus ditangani oleh method pemanggilnya.

Dalam implementasinya, method `reverse()` melakukan validasi input dengan memeriksa apakah string kosong. Jika kondisi ini terpenuhi (`s.length()==0`), method akan melempar exception baru. Jika tidak, method akan melakukan operasi reverse string dengan cara iterasi mundur melalui karakter-karakter string.

Yang menarik dari percobaan ini adalah demonstrasi exception propagation dalam konteks yang praktis. Ketika method `reverse()` dipanggil dari `main()` dengan parameter "This is a string", tidak ada exception yang terjadi karena string tidak kosong, sehingga proses reverse berjalan normal dan menghasilkan string terbalik.

Konsep ini sangat penting dalam aplikasi real-world karena memungkinkan separation of concerns yang baik. Method utility seperti `reverse()` dapat fokus pada implementasi algorithm dan validasi input, sementara method pemanggil bertanggung jawab untuk menangani kondisi error yang mungkin terjadi. Blok finally memastikan bahwa pesan "All done" selalu ditampilkan, memberikan konfirmasi bahwa operasi telah selesai diproses, baik berhasil maupun mengalami error.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 💾 Percobaan 10: IOException dengan File Operations

```java
class RandomAccessRevisi
{
    public static void main(String[] args) {
        String bookList[]={"Satu","Dua","Tiga"};
        int yearList[]={1920,1230,1940};
        try
        {
            RandomAccessFile books = new RandomAccessFile
            ("books.txt","rw");
            for(int i=0;i<3;i++)
            {
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }
            books.seek(0);
            System.out.println(books.readUTF()+" "+books.readInt());
            System.out.println(books.readUTF()+ " "+books.readInt());
            books.close();
        }
        catch(IOException e)
        {
            System.out.println("Indeks melebihi batas");
        }
        System.out.println("test");
    }
}
```

#### Analisis Konsep

Percobaan ini mendemonstrasikan penggunaan exception handling dalam konteks operasi Input/Output (I/O), khususnya dengan file operations menggunakan RandomAccessFile. Operasi I/O merupakan salah satu area di mana exception handling sangat krusial karena melibatkan resource eksternal yang berada di luar kontrol langsung program.

RandomAccessFile adalah class yang memungkinkan read dan write operations pada file dengan akses random (dapat melompat ke posisi tertentu dalam file). Program ini melakukan serangkaian operasi: membuat/membuka file "books.txt" dengan mode read-write ("rw"), menulis data string dan integer secara bergantian, kemudian membaca kembali data tersebut.

Operasi `books.seek(0)` memindahkan file pointer kembali ke awal file untuk memulai operasi baca. Ini menunjukkan salah satu keuntungan RandomAccessFile dibandingkan dengan sequential file access.

IOException adalah checked exception yang harus ditangani ketika melakukan operasi I/O. Berbagai kondisi dapat menyebabkan IOException, seperti file tidak dapat dibuat, permission denied, disk space tidak cukup, atau hardware failure. Penggunaan try-catch untuk IOException memastikan program dapat memberikan response yang appropriate ketika operasi file gagal, daripada crash secara mendadak.

Statement `System.out.println("test")` di luar try-catch menunjukkan bahwa program akan tetap melanjutkan eksekusi setelah menangani exception, yang merupakan prinsip fundamental dari robust error handling.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🏷️ Percobaan 11: Custom Exception Class (extends Throwable)

```java
class RangeErrorException extends Throwable
{
    public RangeErrorException(String s)
    {
        super(s);
    }
    public static void main(String[] args)
    {
        int position=1;
        try
        {
            if(position>0)
            {
                throw new RangeErrorException("Position " +position);
            }
        }
        catch(RangeErrorException e)
        {
            System.out.println("Range error: " +e.getMessage());
        }
        System.out.println("This is the last program.");
    }
}
```

#### Analisis Konsep

Percobaan ini menunjukkan cara membuat custom exception class dengan extending Throwable class. Pembuatan custom exception sangat berguna ketika aplikasi memerlukan error handling yang spesifik untuk domain bisnis atau kondisi khusus yang tidak dicakup oleh built-in exception classes dalam Java.

Class `RangeErrorException` didefinisikan sebagai subclass dari Throwable, yang merupakan parent class dari semua exception dan error dalam Java. Constructor custom exception menerima parameter string dan memanggil `super(s)` untuk menginisialisasi pesan exception melalui constructor parent class.

Dalam method main, program melakukan validasi terhadap variable `position`. Jika nilai position lebih besar dari 0, maka RangeErrorException akan dilempar dengan pesan yang mencakup nilai position tersebut. Ini mendemonstrasikan bagaimana custom exception dapat memberikan informasi kontekstual yang spesifik tentang kondisi error.

Keuntungan menggunakan custom exception adalah kemampuan untuk membuat exception hierarchy yang sesuai dengan domain aplikasi, memberikan pesan error yang lebih meaningful, dan memungkinkan catch blocks yang lebih specific. Dalam aplikasi enterprise yang kompleks, custom exceptions membantu dalam debugging dan maintenance karena memberikan clarity tentang jenis error yang terjadi dan konteks di mana error tersebut muncul.

Saya akan melanjutkan analisis percobaan dari nomor 11 dan 12 sesuai dengan format yang sudah Anda buat. Mari kita lanjutkan dengan konsistensi yang sama:

---

### 🏷️ Percobaan 11: Custom Exception Class (extends Throwable)

```java
class RangeErrorException extends Throwable
{
    public RangeErrorException(String s)
    {
        super(s);
    }
    public static void main(String[] args)
    {
        int position=1;
        try
        {
            if(position>0)
            {
                throw new RangeErrorException("Position " +position);
            }
        }
        catch(RangeErrorException e)
        {
            System.out.println("Range error: " +e.getMessage());
        }
        System.out.println("This is the last program.");
    }
}
```

#### Masalah dan Analisis

Percobaan ini mendemonstrasikan pembuatan custom exception class dengan cara meng-extend class Throwable secara langsung. Program ini tidak memiliki masalah error dalam artian teknis, melainkan sengaja dirancang untuk menunjukkan bagaimana membuat dan menggunakan exception yang didefinisikan sendiri oleh programmer.

#### Solusi

Tidak ada solusi khusus yang diperlukan karena ini adalah demonstrasi konsep. Program berjalan sesuai dengan yang diharapkan - ketika kondisi `position > 0` terpenuhi (yang memang benar karena position = 1), maka RangeErrorException akan dilempar dan ditangkap oleh catch block yang sesuai.

#### Analisis Konsep

Konsep fundamental yang ditunjukkan dalam percobaan ini adalah pembuatan custom exception class. RangeErrorException dibuat sebagai subclass dari Throwable, yang merupakan parent class tertinggi dalam hierarki exception dan error di Java. Dengan meng-extend Throwable, class ini memiliki kemampuan untuk dilempar menggunakan statement throw dan ditangkap menggunakan catch block.

Constructor RangeErrorException menerima parameter String dan memanggil `super(s)` untuk menginisialisasi pesan exception melalui constructor parent class. Ini memungkinkan exception untuk membawa informasi kontekstual yang spesifik tentang kondisi error yang terjadi.

Dalam method main, program melakukan validasi sederhana terhadap variable position. Ketika kondisi tertentu terpenuhi (dalam hal ini position > 0), exception dilempar dengan pesan yang mencakup nilai position tersebut. Ini menunjukkan bagaimana custom exception dapat memberikan feedback yang meaningful dan kontekstual kepada pengguna atau developer.

Keuntungan menggunakan custom exception yang extends Throwable adalah fleksibilitas maksimal dalam menangani kondisi error yang spesifik untuk domain aplikasi. Namun, dalam praktik yang lebih umum, biasanya lebih disarankan untuk meng-extend Exception atau RuntimeException daripada Throwable secara langsung, karena Throwable juga mencakup Error class yang biasanya digunakan untuk masalah sistem yang lebih serius.

Statement `System.out.println("This is the last program.")` yang ditempatkan setelah try-catch block menunjukkan bahwa program tetap melanjutkan eksekusi normal setelah exception ditangani, yang merupakan prinsip dasar dari robust exception handling.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🎨 Percobaan 12: Custom Exception Class (extends Exception)

```java
class MyException extends Exception{
    private String Teks;
    MyException(String s)
    {
        Teks="Exception generated by: "+s;
        System.out.println(Teks);
    }
}
class Eksepsi
{
    static void tampil(String s)throws Exception
    {
        System.out.println("Tampil");
        if(s.equals("amir"))
        {
            throw new MyException(s);
        }
        System.out.println("OK!");
    }
    public static void main(String[] args)throws Exception
    {
        try
        {
            tampil("ali");
            tampil("amir");
        }
        catch(MyException ex)
        {
            System.out.println("Tangkap:"+ex);
        }
    }
}
```

#### Masalah dan Analisis

Percobaan ini mendemonstrasikan implementasi custom exception yang lebih sophisticated dengan meng-extend class Exception. Program ini tidak memiliki bug atau error, melainkan dirancang untuk menunjukkan bagaimana custom exception dapat diintegrasikan dalam aplikasi dengan logic bisnis yang spesifik.

#### Solusi

Tidak ada solusi yang diperlukan karena ini adalah demonstrasi konsep yang berfungsi dengan baik. Program berhasil menunjukkan bagaimana custom exception dapat digunakan untuk menangani kondisi khusus dalam aplikasi.

#### Analisis Konsep

Percobaan ini menunjukkan implementasi yang lebih refined dari custom exception dengan beberapa konsep penting. Pertama, MyException extends Exception (bukan Throwable seperti percobaan sebelumnya), yang merupakan praktik yang lebih umum dan direkomendasikan untuk aplikasi bisnis.

Constructor MyException memiliki implementasi yang menarik - ia tidak hanya menyimpan pesan exception, tetapi juga langsung mencetak informasi ke console. Variable private `Teks` digunakan untuk menyimpan pesan yang diformat dengan prefix "Exception generated by: ". Pendekatan ini menunjukkan bahwa custom exception dapat memiliki behavior tambahan selain hanya menyimpan pesan error.

Method `tampil()` dideklarasikan dengan `throws Exception`, yang berarti ia dapat melempar exception yang harus ditangani oleh method pemanggilnya. Logic di dalam method ini mendemonstrasikan conditional exception throwing - hanya ketika parameter string equals "amir", exception akan dilempar. Ini menunjukkan bagaimana exception dapat digunakan untuk mengimplementasikan business rules atau validasi yang spesifik.

Dalam method main, dua pemanggilan method `tampil()` dilakukan secara berurutan. Pemanggilan pertama dengan parameter "ali" akan berhasil dan mencetak "Tampil" dan "OK!". Pemanggilan kedua dengan parameter "amir" akan memicu MyException, yang kemudian ditangkap oleh catch block.

Aspek menarik dari implementasi ini adalah bahwa ketika MyException dilempar, constructor-nya akan mencetak pesan, dan kemudian catch block juga akan mencetak informasi tambahan. Ini menunjukkan bagaimana multiple layers of logging dapat diimplementasikan dalam exception handling.

Penggunaan custom exception seperti ini sangat berguna dalam aplikasi enterprise di mana different types of business exceptions perlu ditangani dengan cara yang berbeda, memberikan informasi yang spesifik untuk debugging dan user feedback.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

## 🎯 Kesimpulan

Melalui 12 percobaan yang telah dilakukan dalam praktikum Exception Handling ini, pemahaman mendalam tentang mekanisme penanganan error dalam Java telah tercapai. Setiap percobaan mendemonstrasikan aspek yang berbeda dari exception handling, dari konsep dasar hingga implementasi yang lebih advanced.

Percobaan awal (1-4) membangun fondasi pemahaman tentang jenis-jenis exception yang umum terjadi seperti ArrayIndexOutOfBoundsException dan ArithmeticException, serta bagaimana menggunakan try-catch blocks untuk menanganinya. Konsep penting tentang urutan penanganan exception dan multiple catch blocks juga tercover dengan baik dalam percobaan-percobaan ini.

Percobaan 5-7 mengeksplorasi aspek yang lebih advanced seperti mendapatkan informasi detail dari exception objects, penggunaan kata kunci throw untuk melempar exception secara manual, dan cara memberikan custom messages yang meaningful untuk debugging dan user experience.

Percobaan 8-10 menunjukkan konsep yang lebih kompleks seperti exception propagation, penggunaan kata kunci throws untuk mendelegasikan exception handling, dan penerapan finally block untuk cleanup operations. Penggunaan IOException dalam konteks file operations juga memberikan pemahaman praktis tentang checked exceptions.

Percobaan terakhir (11-12) mendemonstrasikan level yang paling advanced yaitu pembuatan custom exception classes. Ini menunjukkan bagaimana developer dapat membuat exception hierarchy yang sesuai dengan domain aplikasi mereka, memberikan error handling yang lebih specific dan meaningful.

Keseluruhan praktikum ini menunjukkan bahwa exception handling bukan hanya tentang mencegah program crash, tetapi juga tentang menciptakan aplikasi yang robust, maintainable, dan user-friendly. Pemahaman yang mendalam tentang exception handling merupakan skill fundamental yang sangat penting untuk pengembangan aplikasi Java yang professional dan reliable.

Konsep-konsep yang dipelajari dalam praktikum ini akan menjadi fondasi yang kuat untuk pengembangan aplikasi yang lebih kompleks, di mana error handling yang proper menjadi kunci utama dalam menciptakan software yang berkualitas tinggi.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)
