package com.ariirwandi13.kuninganasri;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<WisataItem> mWisataList;
    private RecyclerView mRecyclerView;
    private WisataAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createWisataList();
        buildRecyclerView();
    }

    public void createWisataList() {
        mWisataList = new ArrayList<>();
        mWisataList.add(new WisataItem(R.drawable.bukit_panembongan, "Bukit Panembongan", "Rp. 5.000", "Tembong, Kadatuan, Kecamatan Garawangi, Kabupaten Kuningan.", "Untuk para wisatawan yang mencari spot tempat wisata alam dengan panorama yang indah dan sangat instagramable saat diambil foto, maka Bukit Panembongan adalah pilihan tepat. Ada apa saja di Bukit Panembongan ini? Tak hanya pemandangan asri dan alami yang ditawarkan, berbagai macam fasilitas seperti outbound, arena camping, hingga sesi pemotretan prewedding disini juga disediakan. Didukung dengan pemandangan kota Jawa Barat yang dapat dilihat dari ketinggian Bukit Panembongan ini membuat tempat tersebut menjadi spot favorit untuk berfoto. Hamparan perkebunan hijau, teh, hutan, perkampungan warga dapat terlihat layaknya sebuah lukisan alam."));
        mWisataList.add(new WisataItem(R.drawable.taman_kuning, "Taman Kuning Kebun Raya", "Rp. 10.000", "Padabeunghar, Pasawahan, Padaherang, Kecamatan Sindangwangi.", "Kebun Raya Kuningan bisa dikatakan sebagai kebun raya dengan konsep terunik, karena wisatawan akan mendapati jalanan alami berbatu di beberapa area menuju kebun raya ini. Pemandangan yang disuguhkan oleh Kebun RayaKuningan ini pun juga beragam, seperti taman gunung Ciremai, taman kuning, patung kuda, air mancur, dan lain sebagainya. Sedangkan zona tanaman yang ada di Kebun Raya Kuningan ini terbagi menjadi beberapa macam yakni zona buah-buahan, koleksi tumbuhan lokal khususnya di pulau Jawa, koleksi tumbuhan luar negeri, dan masih banyak lagi yang lainnya."));
        mWisataList.add(new WisataItem(R.drawable.salsabila, "Taman Rekreasi Salsabila", "Rp. 9.000", "Jalan Desa Panawuan No. 2, RT. 01 RW. 01, Kecamatan Cigandamekar", "Taman Rekreasi Salsabila menawarkan berbagai wahana taman bermain khas untuk wisata keluarga. Dilengkapi dengan kolam renang layaknya sebuah waterpark beserta seluncuran yang dapat dimainkan oleh seluruh wisatawan. Salah satu keunikan Taman Rekreasi Salsabila dibandingkan taman bermain lainnya adalah yakni dengan adanya bungalow yang bergaya ala Eropa. Dilengkapi dengan cafe dan restoran di dalamnya yang mengusung tema Cowboy, namun jangan khawatir karena makanan yang dihidangkan disini terdapat makanan khas Indonesia juga."));
        mWisataList.add(new WisataItem(R.drawable.curug_putri, "Curug Putri", "Rp. 7.000", "Desa Cisantana, RT.07 / RW.03, Kecamatan Cigugur", "Curug memang salah satu tempat wisata alam andalan Jawa Barat, hampir di setiap pelosok daerah memiliki curug atau air terjun yang khas. Tak terkecuali dengan Curug Putri Palutungan yang berada di Kuningan ini dan dekat dengan Bumi Perkemahan Palutungan. Curug Putri Palutungan berada pada jalur pendakian Gunung Ciremai sehingga banyak pengunjung yang merupakan salah satu dari beberapa pendaki. Curug ini dikelilingi tebing yang lumayan terjal dan juga pepohonan yang rimbun, memberikan kesan asri, sejuk, dan alami bila berkunjung kesini."));
        mWisataList.add(new WisataItem(R.drawable.pemandian_cibulan, "Pemandian Cibulan", "Rp. 10.000", "Maniskidul, Kecamatan Jalaksana", "Pemandian Cibulan Kuningan menawarkan kolam renang pemandian bersama ikan yang dianggap memiliki kekuatan gaib. Air yang berada di kolam ikan ini sangat bening, segar, dan jernih, terdapat ikan kancra bodas yang dilarang untuk ditangkap dan dimakan oleh seluruh pengunjung dan warga setempat. Kolam renang yang ditawarkan disini bermacam ukuran, terdiri dari 3 jenis kolam dengan masing-masing kedalaman yakni 2 meter, 120 centimeter, dan 60 centimeter. Mitos mengatakan bahwa ikan yang berenang di kolam ini merupakan jelmaan dari prajurit Prabu Siliwangi sehingga dilarang untuk ditangkap, apa lagi dimakan."));
        mWisataList.add(new WisataItem(R.drawable.terapi_ikan, "Kolam Terapi Ikan Cigugur", "Rp. 10.000", "Cigugur", "Sama halnya dengan Pemandian Cibulan Kuningan dengan ikan yang dianggap keramat, Kolam Terapi Ikan Cigugur memiliki ribuan Ikan Mangut yang juga didewakan disini. Di sekeliling kolam, pengunjung dapat menceburkan kakinya ke dalam air untuk kemudian dikerubuti oleh beberapa ikan kecil ini. Pengunjung tidak perlu khawatir ikan ini akan melukai manusia, karena tujuan ikan ini adalah untuk memakan sel-sel kulit mati pada kaki pengunjung. Hal ini dipercaya dapat menjadi terapi guna relaksasi bagi otot kaki dan merangsang titik syaraf pada bagian sekitar kaki."));
        mWisataList.add(new WisataItem(R.drawable.pasebantripancatunggal, "Paseban Tri Panca Tunggal", "Gratis", "Jalan Cigugur Sukamulya, Cigugur", "Paseban Tri Panca Tunggal adalah salah satu museum yang juga merupakan cagar budaya berupa padepokan untuk menuntut ilmu kebatinan dan seni budaya. Di sebelah kiri gedung ini terdapat sebuah pendopo yang dihiasi payung unik sehingga menambah keeksotisan tempat ini. Di tengah gedung sendiri ada sebuah patung atau replika burung Garuda yang sedang mengepakan sayapnya. Patung tersebut memiliki posisi sedang berdiri di atas sebuah longkaran yang bertuliskan Purwa Wisada."));
        mWisataList.add(new WisataItem(R.drawable.taman_purbakala, "Taman Purbakala Cipari", "Gratis", "Jalan Purbakala, Cipari, Cigugur", "Sesuai dengan namanya, Taman Purbakala Cipari menyimpan berbagai benda dan kebudayaan peninggalan jaman sejarah. Sedikitnya terdapat 8 tempat peninggalan bersejarah yang letaknya berada di kaki gunung Ciremai ini. Peninggalan sejarah yang bisa dilihat disini ada bermacam-macam, mulai dari jaman manusia purba megalithikum, jaman kolonial Belanda, jaman kerajaan klasik, hingga jaman Hindu-Budha. Artefak seperti peti kubur, batu, dan gerabah masih tertata rapi di dalam penguburan sekitar Taman Purbakala Cipari ini."));
        mWisataList.add(new WisataItem(R.drawable.hutan_mayasih, "Hutan Kota Mayasih", "Rp. 5.000", "Jalan Lumbu, Kecamatan Cigugur", "Hutan Kota Mayasih merupakan salah satu upaya tata ruang hijau oleh pemerintah kota Jawa Barat, sekaligus menjadi tempat wisata yang menyenangkan. Kawasan ini juga disebut sebagai kawasan wisata gunung batu karena sebelumnya banyak gundukan bebatuan di tempat ini sendiri. Untuk menambah fasilitas bagi para wisatawan, terdapat saung-saung kecil atau gazebo yang disediakan bagi pengunjung guna beristirahat sejenak sambil menikmati pemandangan alam sekitarnya. Terdapat juga kolam ikan yang menjadi tampilan tambahan menarik untuk Hutan Kota Mayasih."));
        mWisataList.add(new WisataItem(R.drawable.recreation_park, "The Mountain Recreation Park", "Rp. 12.500", "Perumahan Pesona Alam Kuningan, Jalan Raya Cirendang-Cigugur, Kecamatan Cigugur", "The Mountain Recreation Park memiliki berbagai macam wahana, salah satunya adalah wahana air seperti kolam renang dan waterpark. Selain itu, terdapat juga wisata edukasi untuk menambah pengetahuan dengan memasuki kolam prestasi dan pengenalan pesawat terbang. Selain menyediakan waterboom dan kolam renang, tersedia pula kolam pancingan untuk para wisatawan yang hobi memancing. Berbagai wahan lainnya juga tersaji dalam taman bermain khusus seperti kora-kora, komedi putar, ontang-anting, kereta mini yang dapat mengelilingi sekitar taman bermain, dan masih banyak lagi yang lain sebagainya."));
        mWisataList.add(new WisataItem(R.drawable.perkemahan, "Bumi Perkemahan Palutungan", "Rp. 10.000", "Cisantana, Kecamatan Cigugur, Kabupaten Kuningan.", "Bumi Perkemahan Palutungan adalah salah satu area camping yang dapat digunakan untuk menginap atau semacam jambore. Tempat ini letaknya tidak terlalu jauh dengan Curug Putri Landung dan Curug Putri Palutungan sehingga menambah kesan alami dan asri di perkemahan. Gunung Ciremai pun yang kini telah ditetapkan sebagai Taman Nasional membuat banyak para pendaki memilih menginap di Bumi Perkemahan Palutungan sebelum kemudian melanjutkan perjalanannya. Namun banyak masyarakat mengatakan bahwa tempat ini angker karena telah menjadi salah satu lokasi uji nyali di stasiun TV Indonesia."));
        mWisataList.add(new WisataItem(R.drawable.taman_nasional_ciremai, "Taman Nasional Gunung Ciremai", "Rp. 20.000", "Jalan Raya Kuningan-Cirebon KM. 9 No. 1, Manislor, Kecamatan Jalaksana", "Taman Nasional Gunung Ciremai selain menjadi salah satu tempat wisata dan bumi perkemahan juga menjadi tempat konservasi di Jawa Barat. Terdapat tiga zona yang ada di dalam Gunung Ciremai ini sendiri yakni zona tropik yang paling rendah, zona pegunungan atau montana untuk daerah pertengahan, dan zona subalpin sebagai puncaknya. Terdapat juga Situ Sangiang yakni berupa pemandangan alam danau alami yang sudah masuk dalam kawasan Majalengka. Terlepas dari mitos yang berada di danau ini, pengunjung diperbolehkan memasuki kawasan Situ Sangiang dengan tarif Rp. 3.000 perorang."));

    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new WisataAdapter(mWisataList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new WisataAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Example Item", mWisataList.get(position));

                startActivity(intent);
            }
        });
    }
}
