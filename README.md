# ResepV2

Aplikasi Android Resep V2 — versi final dari aplikasi resep makanan sederhana.  
Menampilkan daftar resep, detail resep, serta fitur tambahan sesuai versi terbaru.

---

## 📱 Fitur Utama

- Daftar resep makanan  
- Detail resep (bahan, langkah, gambar, tips)  
- Navigasi antar layar menggunakan Intent  
- Tampilan UI menarik, mungkin menggunakan Material Components  
- Splash screen  
- Halaman profil atau tentang aplikasi   

---

## 🗂️ Struktur Project

ResepV2/

├── app/

│ ├── src/

│ │ ├── main/

│ │ │ ├── AndroidManifest.xml

│ │ │ ├── java/com/…/ (atau package kamu)

│ │ │ │ ├── MainActivity.kt

│ │ │ │ ├── (Activity / Fragment lain).kt

│ │ │ │ ├── Adapter.kt

│ │ │ │ ├── Model.kt

│ │ │ ├── res/

│ │ │ │ ├── layout/

│ │ │ │ ├── drawable/

│ │ │ │ ├── values/

│ └── build.gradle

├── build.gradle

├── settings.gradle

└── README.md


---

## 🔧 Teknologi & Library

- Bahasa: **JAWA**  
- UI: XML + Material Components / Design Support   
- Gambar: 'IMAGEVIEW'
- Navigasi antar layar: `Intent`  

---

## 🚀 Cara Menjalankan

1. Clone repo:  
   ```
   git clone https://github.com/ridho1141haha/ResepV2.git
2. Buka di Android Studio
3. Pastikan SDK & dependensi sudah terinstall
4. Jalankan pada emulator atau device fisik
5. Tunggu proses build selesai, lalu tekan Run

🔐 Build Signed APK / App Bundle
1. Di Android Studio → Build → Generate Signed Bundle / APK
2. Pilih module app
3. Isi key store seperti biasanya (path, alias, password)
4. Klik Next / Finish
5. Hasilnya bisa ditemukan di app/release/ atau folder outputs

