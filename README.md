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

```
ResepV2/
├── app/
│   ├── manifests/
│   │   └── AndroidManifest.xml
│   │
│   ├── java/
│   │   └── com/ridho/resepku/
│   │       ├── BaksoActivity.java
│   │       ├── GudegActivity.java
│   │       ├── KleponActivity.java
│   │       ├── MenuActivity.java
│   │       ├── MieAyamActivity.java
│   │       ├── NasiGorengActivity.java
│   │       ├── RendangActivity.java
│   │       ├── SateBabiActivity.java
│   │       ├── SplashActivity.java
│   │       ├── TeamActivity.java
│   │       └── TelurBaladoActivity.java
│   │
│   ├── res/
│   │   ├── drawable/
│   │   │   ├── adrian.jpg
│   │   │   ├── alfian.jpg
│   │   │   ├── bakso.jpg
│   │   │   ├── farel.jpg
│   │   │   ├── gudeg.jpg
│   │   │   ├── ic_app_logo.xml
│   │   │   ├── img_splash_food.jpg
│   │   │   ├── klepon.jpg
│   │   │   ├── mie_ayam.jpg
│   │   │   ├── nasi_goreng.jpg
│   │   │   ├── rendang.jpg
│   │   │   ├── ridho.jpg
│   │   │   ├── sate_babi.jpeg
│   │   │   └── telur_balado.jpg
│   │   │
│   │   ├── layout/
│   │   │   ├── activity_bakso.xml
│   │   │   ├── activity_gudeg.xml
│   │   │   ├── activity_klepon.xml
│   │   │   ├── activity_menu.xml
│   │   │   ├── activity_mie_ayam.xml
│   │   │   ├── activity_nasi_goreng.xml
│   │   │   ├── activity_rendang.xml
│   │   │   ├── activity_sate_babi.xml
│   │   │   ├── activity_splash.xml
│   │   │   ├── activity_team.xml
│   │   │   └── activity_telur_balado.xml
│   │   │
│   │   ├── mipmap/
│   │   │   └── (icon aplikasi)
│   │   │
│   │   ├── values/
│   │   │   ├── colors.xml
│   │   │   ├── colors.xml (night)
│   │   │   ├── strings.xml
│   │   │   ├── themes.xml
│   │   │   └── themes.xml (night)
│   │
│   └── xml/
│       └── (optional config files)
│
├── build.gradle              # konfigurasi gradle project
├── build.gradle (Module: app)
├── gradle.properties
├── gradle-wrapper.properties
├── local.properties
├── Readme.md
└── settings.gradle
```


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

