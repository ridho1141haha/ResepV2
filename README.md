# ResepV2

Aplikasi Android Resep V2 — versi lanjutan dari aplikasi resep makanan sederhana.  
Menampilkan daftar resep, detail resep, serta fitur tambahan sesuai versi terbaru.

---

## 📱 Fitur Utama

- Daftar resep makanan  
- Detail resep (bahan, langkah, gambar, tips)  
- Fitur pencarian resep  
- Penyaringan / kategori resep (misalnya berdasarkan jenis, bahan, waktu masak)  
- Mode favorit / simpan resep  
- Navigasi antar layar menggunakan Intent  
- Tampilan UI menarik, mungkin menggunakan Material Components  
- Splash screen  
- Halaman profil atau tentang aplikasi (optional)  

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

yaml
Copy code

---

## 🔧 Teknologi & Library

- Bahasa: **Kotlin**  
- UI: XML + Material Components / Design Support  
- List / Grid: **RecyclerView**  
- Gambar: (jika menggunakan) **Glide** / **Picasso**  
- Navigasi antar layar: `Intent`  
- Persistensi data (jika ada): SharedPreferences / SQLite / Room  
- Lain-lain: library pihak ketiga yang kamu pakai (sebutkan di bagian dependencies)

---

## 🚀 Cara Menjalankan

1. Clone repo:  
   ```bash
   git clone https://github.com/ridho1141haha/ResepV2.git
Buka di Android Studio

Pastikan SDK & dependensi sudah terinstall

Jalankan pada emulator atau device fisik

Tunggu proses build selesai, lalu tekan Run

🔐 Build Signed APK / App Bundle
Di Android Studio → Build → Generate Signed Bundle / APK

Pilih module app

Isi key store seperti biasanya (path, alias, password)

Klik Next / Finish

Hasilnya bisa ditemukan di app/release/ atau folder outputs

