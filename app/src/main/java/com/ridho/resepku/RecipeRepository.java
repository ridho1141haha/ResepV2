package com.ridho.resepku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class RecipeRepository {
    private static final Map<String, Recipe> MAP = new HashMap<>();
    private static final List<Recipe> LIST = new ArrayList<>();

    static {
        init();
    }

    public static List<Recipe> all() {
        return Collections.unmodifiableList(LIST);
    }

    public static Recipe byId(String id) {
        return MAP.get(id);
    }

    private static void init() {
        Recipe gudeg = new Recipe(
                "gudeg",
                "Gudeg",
                R.drawable.gudeg,
                Arrays.asList("nangka muda 1 kg", "santan kental 500 ml", "gula merah 50 g", "daun salam 3", "lengkuas geprek 2 cm", "garam", "air kelapa secukupnya", "telur rebus opsional", "Bumbu halus: bawang merah 8, bawang putih 4, ketumbar 1 sdt, kemiri 3, kencur 1 cm"),
                Arrays.asList("Tumis bumbu halus hingga harum.", "Masukkan nangka, daun salam, dan lengkuas.", "Tuang air kelapa dan gula merah, masak dengan api kecil selama 1-2 jam hingga nangka empuk.", "Masukkan santan kental, aduk perlahan dan koreksi rasa.", "Masak terus hingga kuah menyusut dan gudeg berwarna kecokelatan.")
        );
        MAP.put(gudeg.id, gudeg);
        LIST.add(gudeg);

        Recipe bakso = new Recipe(
                "bakso",
                "Bakso",
                R.drawable.bakso,
                Arrays.asList("daging sapi giling 500 g", "tepung tapioka 100 g", "putih telur 1", "es batu serut 100 g", "bawang putih 3 siung (haluskan)", "merica, garam, kaldu bubuk secukupnya", "Kuah: tulang sapi, bawang putih goreng, daun bawang, garam, merica"),
                Arrays.asList("Aduk rata daging giling, bumbu halus, dan es batu hingga tercampur.", "Tambahkan tepung tapioka, aduk hingga adonan kalis.", "Bentuk adonan menjadi bulatan-bulatan bakso.", "Rebus bakso dalam air mendidih hingga mengapung dan matang.", "Siapkan kuah dengan merebus tulang sapi dan bumbu.", "Sajikan bakso dengan kuah, mie/sohun, dan sawi.")
        );
        MAP.put(bakso.id, bakso);
        LIST.add(bakso);

        Recipe telurBalado = new Recipe(
                "telur_balado",
                "Telur Balado",
                R.drawable.telur_balado,
                Arrays.asList("telur rebus 6 butir", "cabai merah besar 6 buah", "cabai rawit 3 buah (sesuai selera)", "bawang merah 6 siung", "bawang putih 3 siung", "tomat 1 buah", "gula, garam secukupnya", "sedikit perasan jeruk nipis"),
                Arrays.asList("Goreng telur rebus sebentar hingga berkulit, angkat dan tiriskan.", "Haluskan (blender kasar) cabai, bawang merah, bawang putih, dan tomat.", "Tumis bumbu halus hingga harum dan matang.", "Beri gula, garam, dan perasan jeruk nipis, koreksi rasa.", "Masukkan telur goreng, aduk rata dengan bumbu balado.")
        );
        MAP.put(telurBalado.id, telurBalado);
        LIST.add(telurBalado);

        Recipe klepon = new Recipe(
                "klepon",
                "Klepon",
                R.drawable.klepon,
                Arrays.asList("tepung ketan 250 g", "pasta pandan atau air daun suji secukupnya", "gula merah 100 g (sisir halus)", "kelapa parut 100 g", "garam secukupnya"),
                Arrays.asList("Campur tepung ketan dengan pasta/air pandan sedikit demi sedikit hingga adonan bisa dipulung.", "Ambil sedikit adonan, pipihkan, lalu isi dengan gula merah sisir, bulatkan kembali.", "Rebus klepon dalam air mendidih hingga mengapung.", "Kukus kelapa parut yang sudah dicampur sedikit garam selama 5 menit.", "Gulingkan klepon yang sudah matang ke dalam kelapa parut.")
        );
        MAP.put(klepon.id, klepon);
        LIST.add(klepon);

        Recipe sateBabi = new Recipe(
                "sate_babi",
                "Sate Babi",
                R.drawable.sate_babi,
                Arrays.asList("daging babi 500 g (potong dadu)", "kecap asin 2 sdm", "kecap manis 2 sdm", "bawang putih 3 siung (haluskan)", "ketumbar bubuk 1 sdt", "gula 1 sdt", "merica, minyak secukupnya"),
                Arrays.asList("Campurkan daging babi dengan semua bumbu, aduk rata. Diamkan (marinasi) selama minimal 1 jam.", "Tusuk daging pada tusukan sate.", "Bakar atau panggang sate sambil diolesi sisa bumbu marinasi hingga matang.", "Sajikan dengan sambal matah atau sambal kecap.")
        );
        MAP.put(sateBabi.id, sateBabi);
        LIST.add(sateBabi);

        Recipe mieAyam = new Recipe(
                "mie_ayam",
                "Mie Ayam",
                R.drawable.mie_ayam,
                Arrays.asList("mie kuning basah 400 g", "dada/paha ayam cincang 300 g", "kecap manis 3 sdm", "kecap asin 1 sdm", "saus tiram 1 sdm", "bawang putih 4 siung (cincang)", "jahe 1 cm (geprek)", "merica, garam, minyak ayam", "sawi hijau"),
                Arrays.asList("Tumis bawang putih dan jahe hingga harum.", "Masukkan ayam cincang, masak hingga berubah warna.", "Bumbui dengan kecap manis, kecap asin, saus tiram, merica, dan garam. Masak hingga bumbu meresap.", "Rebus mie dan sawi hijau hingga matang, tiriskan.", "Di mangkuk, campur sedikit minyak ayam dan kecap asin. Masukkan mie, aduk rata.", "Beri topping ayam dan sawi di atas mie.")
        );
        MAP.put(mieAyam.id, mieAyam);
        LIST.add(mieAyam);

        Recipe rendang = new Recipe(
                "rendang",
                "Rendang",
                R.drawable.rendang,
                Arrays.asList("daging sapi 1 kg", "santan kental 1 liter", "serai 2 batang (geprek)", "daun jeruk 4 lembar", "daun kunyit 1 lembar", "asam kandis 2 buah", "Bumbu halus: cabai merah 10, bawang merah 10, bawang putih 5, jahe 3 cm, lengkuas 3 cm, kunyit 2 cm, kemiri 4, garam"),
                Arrays.asList("Tumis bumbu halus hingga matang dan harum.", "Masukkan santan, serai, daun jeruk, dan daun kunyit. Aduk hingga mendidih.", "Masukkan potongan daging sapi dan asam kandis.", "Masak dengan api kecil sambil terus diaduk perlahan selama 2-3 jam.", "Masak hingga santan mengering, mengeluarkan minyak, dan bumbu rendang menjadi gelap kecokelatan.")
        );
        MAP.put(rendang.id, rendang);
        LIST.add(rendang);

        Recipe nasiGoreng = new Recipe(
                "nasi_goreng",
                "Nasi Goreng",
                R.drawable.nasi_goreng,
                Arrays.asList("nasi putih 2 porsi", "telur 2 butir", "bawang putih 3 siung (cincang)", "bawang merah 3 siung (iris)", "cabai rawit sesuai selera (opsional)", "kecap manis 2 sdm", "kecap asin 1 sdt", "garam, kaldu bubuk, minyak goreng"),
                Arrays.asList("Panaskan minyak, buat telur orak-arik, sisihkan di pinggir wajan.", "Tumis bawang putih, bawang merah, dan cabai hingga harum.", "Masukkan nasi putih, aduk rata dengan bumbu dan telur.", "Bumbui dengan kecap manis, kecap asin, garam, dan kaldu bubuk.", "Aduk terus hingga semua tercampur rata, panas, dan sedikit wangi gosong khas nasi goreng.")
        );
        MAP.put(nasiGoreng.id, nasiGoreng);
        LIST.add(nasiGoreng);
    }
}
