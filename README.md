# 🚨 Praktikum Exception Handling - Java

## 👨‍💻 Informasi Mahasiswa
- **Nama**: M. Sechan Alfarisi
- **Kelas**: TI23A  
- **NIM**: 20230040094

---

## 📋 Daftar Isi

- [📝 Pendahuluan](#-pendahuluan)
- [🔬 Hasil Analisis Percobaan](#-hasil-analisis-percobaan)
  - [🔴 Percobaan 1: ArrayIndexOutOfBoundsException](#-percobaan-1-arrayindexoutofboundsexception)
  - [🔄 Percobaan 2: Loop dengan ArrayIndexOutOfBoundsException](#-percobaan-2-loop-dengan-arrayindexoutofboundsexception)
  - [➗ Percobaan 3: ArithmeticException - Pembagian dengan Nol](#-percobaan-3-arithmeticexception---pembagian-dengan-nol)
  - [🔀 Percobaan 4: Multiple Exception dalam Satu Try Block](#-percobaan-4-multiple-exception-dalam-satu-try-block)
  - [🔍 Percobaan 5: Metode untuk Mendapatkan Informasi Exception](#-percobaan-5-metode-untuk-mendapatkan-informasi-exception)
  - [🎯 Percobaan 6: Menggunakan Kata Kunci `throw`](#-percobaan-6-menggunakan-kata-kunci-throw)
  - [🏗️ Percobaan 7: Membuat dan Melempar Exception Custom](#️-percobaan-7-membuat-dan-melempar-exception-custom)
  - [📤 Percobaan 8: Kata Kunci `throws` dan `finally`](#-percobaan-8-kata-kunci-throws-dan-finally)
  - [🔄 Percobaan 9: Exception Propagation](#-percobaan-9-exception-propagation)
  - [💾 Percobaan 10: IOException dengan File Operations](#-percobaan-10-ioexception-dengan-file-operations)
  - [🏷️ Percobaan 11: Custom Exception Class (extends Throwable)](#️-percobaan-11-custom-exception-class-extends-throwable)
  - [🎨 Percobaan 12: Custom Exception Class (extends Exception)](#-percobaan-12-custom-exception-class-extends-exception)
- [🎯 Kesimpulan](#-kesimpulan)

---

## 📝 Pendahuluan

Repository ini berisi hasil praktikum saya dalam mempelajari penanganan kesalahan (exception handling) pada bahasa pemrograman Java. Tujuan utama praktikum ini adalah untuk memahami cara kerja mekanisme penanganan error menggunakan blok `try-catch`, `finally`, serta kata kunci `throw` dan `throws`. Melalui 12 percobaan yang saya lakukan, saya dapat menganalisis berbagai jenis exception yang umum terjadi dalam pemrograman Java dan cara menanganinya dengan tepat.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

## 🔬 Hasil Analisis Percobaan

### 🔴 Percobaan 1: ArrayIndexOutOfBoundsException

**Masalah Awal:**
Pada kode pertama, saya mencoba mengakses elemen array dengan indeks yang melebihi ukuran array. Array `a` memiliki ukuran 5 (indeks 0-4), tetapi saya mencoba mengakses indeks ke-5.

```java
// ❌ Kode bermasalah
public class Exception {
    public static void main(String[] args) {
        int a[] = new int[5];  // Array dengan indeks 0-4
        a[5] = 100;           // Error! Indeks 5 tidak ada
    }
}
```

**Solusi yang Diterapkan:**
Saya membungkus kode yang berpotensi error dengan blok `try-catch`. Ketika exception terjadi, program tidak akan crash melainkan menampilkan pesan "Terjadi pelanggaran memory".

```java
// ✅ Kode diperbaiki
public class Exception {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;  // Operasi yang berpotensi error
        }
        catch(Exception e) {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}
```

**Analisis:**
ArrayIndexOutOfBoundsException terjadi karena Java melakukan bound checking pada array untuk mencegah akses memori yang tidak valid. Dengan menggunakan try-catch, alur program tetap dapat berlanjut tanpa terhenti secara paksa, yang merupakan prinsip dasar dari defensive programming.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🔄 Percobaan 2: Loop dengan ArrayIndexOutOfBoundsException

**Masalah Awal:**
Program menggunakan loop while yang berjalan 4 kali (i<4), sedangkan array `greeting` hanya memiliki 3 elemen. Pada iterasi keempat, terjadi error karena mencoba mengakses indeks yang tidak ada.

```java
// ❌ Kode bermasalah
public class Exception2 {
    public static void main(String[] args) {
        int i = 0;
        String greeting[] = {
            "Hello World!",
            "No, I mean it!",
            "Hello World"
        };  // Array dengan 3 elemen (indeks 0-2)
        
        while(i < 4) {  // Loop 4 kali - akan error di iterasi ke-4
            System.out.println(greeting[i]);
            i++;
        }
    }
}
```

**Solusi yang Diterapkan:**
Saya menempatkan operasi print dan increment di dalam blok try-catch. Ketika exception terjadi, nilai indeks direset ke 0, sehingga loop akan mulai dari awal.

```java
// ✅ Kode diperbaiki
public class Exception2 {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {
            "Hello World!",
            "No,I mean it!",
            "HELLO WORLD!"
        };
        
        while(i < 4) {
            try {
                System.out.println(greetings[i]);
                i++;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                i = 0;  // Reset indeks untuk mengulang dari awal
            }
        }
    }
}
```

**Analisis:**
Pendekatan ini menunjukkan bagaimana exception handling dapat digunakan untuk recovery dari error. Namun, dari segi praktik programming yang baik, sebenarnya lebih ideal untuk memperbaiki kondisi loop agar tidak melebihi batas array. Exception handling sebaiknya digunakan untuk situasi yang benar-benar unexpected, bukan untuk mengontrol alur program normal.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### ➗ Percobaan 3: ArithmeticException - Pembagian dengan Nol

**Masalah Awal:**
Program melakukan operasi pembagian dengan nol (`bil/0`), yang dalam Java akan menghasilkan ArithmeticException.

```java
// ❌ Kode bermasalah
public class Exception3 {
    public static void main(String[] args) {
        int bil = 10;
        System.out.println(bil/0);  // Error! Pembagian dengan nol
    }
}
```

**Solusi yang Diterapkan:**
Saya menerapkan dua variasi solusi. Pertama menggunakan catch Exception secara umum, kedua menggunakan catch ArithmeticException yang lebih spesifik, diikuti dengan catch Exception sebagai fallback.

```java
// ✅ Solusi dengan multiple catch
public class CobaException3 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil/0);
        }
        catch(ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error");
        }
        catch(Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
```

**Analisis:**
Pembagian dengan nol merupakan operasi matematika yang tidak valid. Java mendeteksi kondisi ini dan melempar ArithmeticException. Penggunaan multiple catch blocks menunjukkan hierarki exception handling, di mana exception yang lebih spesifik ditangani terlebih dahulu. Ini memungkinkan saya memberikan response yang lebih tepat sesuai jenis error yang terjadi.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🔀 Percobaan 4: Multiple Exception dalam Satu Try Block

**Masalah Awal:**
Program memiliki dua operasi yang berpotensi error: akses array di luar batas dan pembagian dengan nol. Urutan eksekusi menentukan exception mana yang akan terjadi terlebih dahulu.

```java
// 🔄 Demonstrasi urutan exception
public class CobaException4 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        
        try {
            System.out.println(bil/0);      // ArithmeticException terjadi dulu
            System.out.println(b[3]);       // Tidak akan pernah dieksekusi
        }
        catch(ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Melebihi jumlah array");
        }
        catch(Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
```

**Analisis:**
Konsep penting di sini adalah bahwa ketika exception terjadi, eksekusi dalam blok try langsung berhenti dan melompat ke catch block yang sesuai. Exception kedua tidak akan pernah terjadi karena program sudah keluar dari try block. Ini menunjukkan pentingnya memahami flow control dalam exception handling.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🔍 Percobaan 5: Metode untuk Mendapatkan Informasi Exception

**Solusi dan Analisis:**
Di sini saya mempelajari berbagai metode yang tersedia pada object Exception untuk debugging yang lebih efektif:

```java
public class Exception5 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil/0);
        }
        catch(ArithmeticException e) {
            System.out.println("Pesan error: ");
            System.out.println(e.getMessage());           // Pesan singkat error
            System.out.println("Info stack erase");
            e.printStackTrace();                          // Stack trace ke stderr
            e.printStackTrace(System.out);               // Stack trace ke stdout
        }
        catch(Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
```

Metode-metode ini sangat berguna untuk debugging karena memberikan informasi detail tentang lokasi dan penyebab error. Stack trace khususnya membantu saya melacak alur pemanggilan method yang mengarah ke exception.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🎯 Percobaan 6: Menggunakan Kata Kunci `throw`

**Analisis:**
Program ini menunjukkan cara manual melempar exception menggunakan kata kunci `throw`.

```java
public class ThrowExample {
    static void demo() {
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;  // Melempar exception secara manual
        
        // Baris ini tidak akan pernah dieksekusi
        System.out.println("Ini tidak lagi dicetak");
    }
    
    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        }
        catch(NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}
```

Method `demo()` secara eksplicit membuat dan melempar NullPointerException. Ketika exception dilempar, eksekusi method langsung berhenti, sehingga statement setelah throw tidak akan pernah dieksekusi. Exception ini kemudian ditangkap di method `main()`.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🏗️ Percobaan 7: Membuat dan Melempar Exception Custom

```java
public class ThrowExample2 {
    public static void main(String[] args) {
        try {
            throw new Exception("Here's my Exception");  // Custom message
        }
        catch(Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():" + e.getMessage());  // Pesan custom
            System.out.println("e.toString():" + e.toString());      // Class + pesan
            System.out.println("e.printStackTrace():");
            e.printStackTrace();                                     // Detail stack
        }
    }
}
```

**Analisis:**
Program ini mendemonstrasikan fleksibilitas dalam memberikan informasi exception yang sesuai dengan konteks aplikasi melalui berbagai method untuk menampilkan informasi error.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 📤 Percobaan 8: Kata Kunci `throws` dan `finally`

**Analisis:**
Program menunjukkan perbedaan antara mendeklarasikan exception dengan `throws` versus menangani langsung dengan try-catch.

```java
// Versi dengan throws - meneruskan tanggung jawab handling ke caller
class Test3 {
    public void methodB() throws IOException {
        System.out.println(20/0);  // ArithmeticException, bukan IOException
        System.out.println("Method B");
    }
}

// Versi dengan try-catch-finally - handling langsung
class Utama {
    public static void main(String[] args) {
        Test3 o = new Test3();
        o.methodA();
        try {
            o.methodB();
        }
        catch(Exception e) {
            System.out.println("Error di Method B");
        }
        finally {
            System.out.println("Ini selalu dicetak");  // Selalu dieksekusi
        }
    }
}
```

Blok `finally` akan selalu dieksekusi baik ada exception maupun tidak, menjadikannya ideal untuk cleanup operations seperti menutup file atau database connections.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🔄 Percobaan 9: Exception Propagation

```java
class Propagate {
    public static String reverse(String s) throws Exception {
        if(s.length() == 0) {
            throw new Exception();  // Exception dilempar dari method ini
        }
        String reverseStr = "";
        for(int i = s.length()-1; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(reverse("This is a string"));  // Exception ditangkap di sini
        }
        catch(Exception e) {
            System.out.println("The String was blank");
        }
        finally {
            System.out.println("All done");
        }
    }
}
```

**Analisis:**
Program ini menunjukkan exception propagation - bagaimana exception dapat berpindah dari method yang dipanggil ke method pemanggil. Ini memungkinkan separation of concerns yang baik.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 💾 Percobaan 10: IOException dengan File Operations

```java
import java.io.*;

class RandomAccessRevisi {
    public static void main(String[] args) {
        String bookList[] = {"Satu", "Dua", "Tiga"};
        int yearList[] = {1920, 1230, 1940};
        
        try {
            RandomAccessFile books = new RandomAccessFile("books.txt", "rw");
            
            // Menulis data ke file
            for(int i = 0; i < 3; i++) {
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }
            
            // Membaca data dari file
            books.seek(0);  // Kembali ke awal file
            System.out.println(books.readUTF() + " " + books.readInt());
            System.out.println(books.readUTF() + " " + books.readInt());
            books.close();
        }
        catch(IOException e) {
            System.out.println("Indeks melebihi batas");
        }
        System.out.println("test");
    }
}
```

**Analisis:**
Program ini menunjukkan pentingnya exception handling dalam operasi yang melibatkan resource eksternal seperti file, di mana banyak hal di luar kontrol program dapat menyebabkan error.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🏷️ Percobaan 11: Custom Exception Class (extends Throwable)

```java
class RangeErrorException extends Throwable {
    public RangeErrorException(String s) {
        super(s);  // Memanggil constructor parent class
    }
    
    public static void main(String[] args) {
        int position = 1;
        try {
            if(position > 0) {
                throw new RangeErrorException("Position " + position);
            }
        }
        catch(RangeErrorException e) {
            System.out.println("Range error: " + e.getMessage());
        }
        System.out.println("This is the last program.");
    }
}
```

**Analisis:**
Custom exception berguna ketika saya ingin memberikan error handling yang spesifik untuk domain aplikasi saya. Extending Throwable memberikan fleksibilitas maksimal untuk kebutuhan khusus.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

### 🎨 Percobaan 12: Custom Exception Class (extends Exception)

```java
class MyException extends Exception {
    private String Teks;
    
    MyException(String s) {
        Teks = "Exception generated by: " + s;
        System.out.println(Teks);
    }
}

class Eksepsi {
    static void tampil(String s) throws Exception {
        System.out.println("Tampil");
        if(s.equals("amir")) {
            throw new MyException(s);  // Lempar exception jika kondisi terpenuhi
        }
        System.out.println("OK!");
    }
    
    public static void main(String[] args) throws Exception {
        try {
            tampil("ali");    // Tidak akan error
            tampil("amir");   // Akan melempar MyException
        }
        catch(MyException ex) {
            System.out.println("Tangkap:" + ex);
        }
    }
}
```

**Analisis:**
Program ini menunjukkan implementasi custom exception yang lebih proper dengan extending Exception class. Business logic dikombinasikan dengan exception handling untuk kontrol flow yang lebih sophisticated.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

## 🎯 Kesimpulan

Melalui praktikum ini, saya memperoleh pemahaman mendalam tentang exception handling dalam Java. Beberapa insight penting yang saya dapatkan:

**🛡️ Defensive Programming**: Exception handling bukan hanya tentang mencegah program crash, tetapi juga tentang membuat program yang robust dan user-friendly. Dengan memahami hierarki exception dan menggunakan multiple catch blocks, saya dapat memberikan response yang tepat untuk berbagai jenis error.

**🔧 Resource Management**: Penggunaan `finally` block sangat penting untuk resource management, memastikan cleanup operations selalu dijalankan. Sedangkan kata kunci `throw` dan `throws` memberikan kontrol yang lebih fine-grained dalam mengelola exception flow.

**🎨 Customization**: Custom exception classes memungkinkan saya membuat error handling yang sesuai dengan domain aplikasi, memberikan informasi yang lebih meaningful kepada user atau developer lain.

**⚖️ Best Practices**: Yang paling penting, saya menyadari bahwa exception handling harus digunakan dengan bijak. Exception seharusnya untuk kondisi yang benar-benar exceptional, bukan untuk mengontrol alur program normal. Good programming practice tetap yang utama, dengan exception handling sebagai safety net untuk situasi yang tidak terduga.

Praktikum ini memberikan fondasi yang solid untuk mengembangkan aplikasi Java yang lebih reliable dan maintainable di masa depan. Pemahaman tentang exception handling akan sangat berguna dalam menghadapi berbagai skenario error yang kompleks dalam pengembangan software.

[⬆️ Kembali ke Daftar Isi](#-daftar-isi)

---

*📚 Repository ini dibuat sebagai bagian dari pembelajaran Exception Handling dalam mata kuliah Pemrograman Java*