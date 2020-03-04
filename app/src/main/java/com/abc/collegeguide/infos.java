package com.abc.collegeguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class infos extends AppCompatActivity {

    RecyclerView recyclerView;
    CollegeAdapter adapter;

    List<college> collegeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos);




        collegeList =new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.Recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        collegeList.add(
                new college(
                        1,
                        "Chandubhai S Patel Institute of Technology",
                        "Charusat Campus, Changa,\n" +
                                "Taluka: Petlad, Dist: Anand,\n" +
                                "Gujarat (India) 388 421.",
                        "www.charusat.ac.in/CSPIT",
                        " 02697-265011/21",
                        R.drawable.cspit));

        collegeList.add(
                new college(
                        2,
                        "Devang Patel Institute of Advance Technology And Research",
                        "Charusat Campus, Changa,\n" +
                                "Taluka: Petlad, Dist: Anand,\n" +
                                "Gujarat (India) 388 421.",
                        "www.charusat.ac.in/DPIATR",
                        " 02697-265011/2",
                        R.drawable.depstar));
        collegeList.add(
                new college(
                        3,
                        "DHARMSINH DESAI UNIVERSITY.",
                        "College Road, Nadiad 387 001, Gujarat, India",
                        "www.ddu.ac.in",
                        "91 268 2520502",
                        R.drawable.ddu

                )
        );

        collegeList.add(
                new college(
                        4,
                        "A.D.PATEL INSTITUTE OF TECHNOLOGY",
                        "New Vallabh Vidhyanagar, Post Box:-52 \n" +
                                "Vitthal Udyognagar-388121 \n" +
                                "Dist:-Anand(Gujarat) India ",
                        "www.adit.ac.in",
                        "+91-2692-233680",
                        R.drawable.adit
                )
        );

        collegeList.add(
                new college(
                        5,
                        "Lalbhai Dalpatbhai College of Engineering",
                        "120, Circular Road, University Area, Ahmedabad, Gujarat 380015",
                        "http://ldce.ac.in/",
                        " 079 2630 2887",
                        R.drawable.ld
                )
        );

        collegeList.add(
                new college(
                        6,
                        "Birla Vishvakarma Mahavidyalaya Engineering College",
                        "No. 20, Vallabh Vidyanagar, District: Anand. PIN 388120",
                        "www.bvmengineering.ac.in",
                        "02692 230 104",
                        R.drawable.bvm


                )
        );

        collegeList.add(
                new college(
                        7,
                        "Nirma University",
                        " Sarkhej-Gandhinagar Highway, Gota, Ahmedabad, Gujarat 382481\n",
                        "www.nirmauni.ac.in",
                        "079-30642000",
                        R.drawable.nirma


                )
        );

        collegeList.add(
                new college(
                        8,
                        "Dhirubhai Ambani Institute of Information and Communication Technology ",
                        " Near Reliance Chowkdi, DA IICT Road, Gandhinagar, Gujarat 382007",
                        "http://www.daiict.ac.in/",
                        " (+91) 079-3052-0000", R.drawable.dai


                        )
        );

        collegeList.add(
                new college(
                        9,
                        "Sardar Vallabhbhai National Institute of Technology, Surat",
                        "Ichchhanath, SURAT-395 007\n" +
                                "Gujarat.",
                        "http://www.svnit.ac.in/",
                        " 0261-2259571, 2259582-84 .",R.drawable.nit

                        )
        );


        collegeList.add(
                new college(
                        10,
                        "Maharaja Sayajirao University of Baroda",
                        "Pratapgunj, Vadodara, Gujarat 390002",
                        "http://www.msubaroda.ac.in/",
                        "0265 - 2795555",R.drawable.msu
                        )
        );

        collegeList.add(
                new college(
                        11,
                        "Vishwakarma Government Engineering College",
                        " Nr. Visat Three Roads, Sabarmati-Koba Highway, Chandkheda, Ahmedabad, Gujarat 382424",
                        "http://www.vgecg.ac.in/",
                        "079 2909 9903",R.drawable.vis
                        )
        );


        collegeList.add(
                new college(
                        12,
                        "Pandit Deendayal Petroleum University ",
                        " Raisan, Gandhinagar, Gujarat 382421",
                        "http://www.pdpu.ac.in/",
                        " 079-2327 5403",R.drawable.pdpu
                        )
        );

        collegeList.add(
                new college(
                        13,
                        "LDRP Institute of Technology and Research",
                        " Sector - 15, Near KH - 5, Gandhinagar, Gujarat 382015",
                        "https://www.ldrp.ac.in/",
                        "079 2324 1492",R.drawable.ldrp
                        )
        );

        collegeList.add(
                new college(
                        14,
                        "G. H. Patel College of Engineering and Technology",
                        "Bakrol Rd, Mota Bazaar, Vallabh Vidyanagar, Anand, Gujarat 388120",
                        "http://www.gcet.ac.in/",
                        "+91 9099063011",R.drawable.gcet
                        )
        );

        collegeList.add(
                new college(
                        15,
                        "Indus University",
                        "Rancharda, Via: Thaltej,\n" +
                                "Ahmedabad - 382 115.\n" +
                                "Gujarat, INDIA.",
                        "http://www.indusuni.ac.in",
                        "+91 9099944241 / 42",R.drawable.ind

                        )
        );

        collegeList.add(
                new college(
                        16,
                        "L.J. INSTITUTE OF ENGINEERING AND TECHNOLOGY",
                        " S.G. Road, Between Sarkhej Circle & Kataria Motors, Ahmedabad, Gujarat 382210",
                        "http://gtu-info.com/college/LJ-INSTITUTES/LJIT-Ahmedabad-L-J-Institute",
                        ": 079-26890383",R.drawable.lj

                        )
        );

        collegeList.add(
                new college(
                        17,
                        "CEPT University",
                        " Kasturbhai Lalbhai Campus, University Rd, Navrangpura, Ahmedabad, Gujarat 380009",
                        "https://cept.ac.in/",
                        "079 2630 2470",R.drawable.cep

                        )
        );

        collegeList.add(
                new college(
                        18,
                        "Indian Institute of Information Technology, Vadodara",
                        "C/o Block No.9 (IC Department), Government Engineering College, Sector 28, Gandhinagar, Gujarat 382028",
                        "http://www.iiitvadodara.ac.in/",
                        "079 2975 0281",R.drawable.ii
                        )
        );

        collegeList.add(
                new college(
                        19,
                        "Dr. S & S. S. Ghandhy College of Engineering & Technology",
                        "Majura Gate, Surat, Gujarat 395001",
                        "http://www.ssgc.cteguj.in/",
                        "079 2655799",R.drawable.ss
                        )
        );
        collegeList.add(
                new college(
                        20,
                        "Lukhdhirji Engineering College",
                        "LE College Rd, Near Natraj Fatak, Morbi - 2, Morbi, Gujarat 363642",
                        "http://www.lecm.cteguj.in/",
                        "+91 9428054531",R.drawable.mor
                        )
        );






        adapter=new CollegeAdapter(this,collegeList);
        recyclerView.setAdapter(adapter);

    }
}

