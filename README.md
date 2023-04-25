# ucd
[`download` 📦](https://github.com/jhpoelen/ucd/archive/42a5815a2c50e396f1e34e9f73e0b13fcc67c44f.zip) 

[![SWH](https://archive.softwareheritage.org/badge/swh:1:dir:52ac4d104b6f031359da84ee57ebc8fe389bf8fb/)](https://archive.softwareheritage.org/swh:1:dir:52ac4d104b6f031359da84ee57ebc8fe389bf8fb;origin=https://github.com/jhpoelen/ucd;visit=swh:1:snp:aa05010ed2e1248647bdf47e38c983deddb62ca2;anchor=swh:1:rev:89c9da3f5e293642c394416ca7e5e9e26979e3a9)

[![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.7863906.svg)](https://doi.org/10.5281/zenodo.7863906)

This repository contains an archival copy of the Universal Chalcidoidea Database (UCD) by J.S. Noyes in their original [Paradox Database](https://en.wikipedia.org/wiki/Paradox_%28database%29) file format. 

All files were provided by J.S. Noyes in period 2023-03/2023-04 and gave consent to publish the data under CC0.

For getting started, please see the [`Instructions`](./Instructions%28Please%20read%20first%29.pdf) first. Then, suggest to take a look at a [`Flowchart`](./Flowchart.pdf) and the [`Table Structure`](./TableStructure.pdf).

## Citation
On use of this data, please follow academic tradition and cite the data using:  

Noyes, J.S. March 2019. Universal Chalcidoidea Database. World Wide Web electronic publication. http://www.nhm.ac.uk/chalcidoids. hash://sha256/562fc5f7ac62b0dba9952e267dc839ab16be3efcf149b98a8d77f6e88bce4f53 hash://md5/de2883bc9f8b1e79c96f5d00d650f596 .

## Signed Content 

Using Preston [1,2], the UCD content was packaged and their provenance was signed.

```bash
preston history\
 --anchor hash://sha256/562fc5f7ac62b0dba9952e267dc839ab16be3efcf149b98a8d77f6e88bce4f53\
 --remote https://raw.githubusercontent.com/jhpoelen/ucd/main/data\
 --remote https://zenodo.org/record/7844167/files\
 --remote https://softwareheritage.org\
 --remote https://linker.bio
```

yielded:

```
<hash://sha256/562fc5f7ac62b0dba9952e267dc839ab16be3efcf149b98a8d77f6e88bce4f53> <http://www.w3.org/ns/prov#wasDerivedFrom> <hash://sha256/dc3f137ed7e456dd964545527cfff3acc3c1655baeaebecb6d07cdf3e1bbd549> .
<hash://sha256/dc3f137ed7e456dd964545527cfff3acc3c1655baeaebecb6d07cdf3e1bbd549> <http://www.w3.org/ns/prov#wasDerivedFrom> <hash://sha256/298581b34133b518f251f4321f1920488afd923f3308e45b9c1d169da0e16b5b> .
<hash://sha256/298581b34133b518f251f4321f1920488afd923f3308e45b9c1d169da0e16b5b> <http://www.w3.org/ns/prov#wasDerivedFrom> <hash://sha256/ec1760dc83dfb17df003ef5e626b965dd4403850bc58286ac59c7ef3a447e063> .
<hash://sha256/ec1760dc83dfb17df003ef5e626b965dd4403850bc58286ac59c7ef3a447e063> <http://www.w3.org/ns/prov#wasDerivedFrom> <hash://sha256/eb416c97bf52a36b31ece2b47431a6a4a9bda7f52b9bc8ccb92f91f5c1bdf268> .
<urn:uuid:0659a54f-b713-4f86-a917-5be166a14110> <http://purl.org/pav/hasVersion> <hash://sha256/eb416c97bf52a36b31ece2b47431a6a4a9bda7f52b9bc8ccb92f91f5c1bdf268> .
```

and can be cloned using

```bash
preston clone
 --anchor hash://sha256/562fc5f7ac62b0dba9952e267dc839ab16be3efcf149b98a8d77f6e88bce4f53\
 --remote https://raw.githubusercontent.com/jhpoelen/ucd/main/data\
 --remote https://zenodo.org/record/7844167/files\
 --remote https://softwareheritage.org\
 --remote https://linker.bio
```

with associated content cataloged via 

```bash
preston alias
 --anchor hash://sha256/562fc5f7ac62b0dba9952e267dc839ab16be3efcf149b98a8d77f6e88bce4f53\
 --remote https://raw.githubusercontent.com/jhpoelen/ucd/main/data\
 --remote https://zenodo.org/record/7844167/files\
 --remote https://softwareheritage.org\
 --remote https://linker.bio
```

 content location | content id 
 --- | --- 
[./Flowchart.pdf](./Flowchart.pdf) | hash://sha256/27b3b68f7109f29a7a0894d0a75fd2efb01e561fb0038232963a1d213d03767f
[./TableStructures.pdf](./TableStructures.pdf) | hash://sha256/398b2dc74c81ff3a761103198e549ed40a7f422d99a4dc2a3fb6167d5ee04a60
[./UCD%20Editting.pdf](./UCD%20Editting.pdf) | hash://sha256/93c5a4b610a08c7f9080dfd4327c0d9de78978f98e7e057c6155ef8cc19f82e6
[./PDOX40/CONFIG.BGI](./PDOX40/CONFIG.BGI) | hash://sha256/9902a477f8d78fcb19c106c4a1951988eb8eaf2581e3f8faaa0de339cd56a4bc
[./PDOX40/HERC.BGI](./PDOX40/HERC.BGI) | hash://sha256/ac825cf430abd8ad97f128fb54aa88b34f6187793e22a5383de2658a98bf62d9
[./PDOX40/NW2.DB](./PDOX40/NW2.DB) | hash://sha256/3ad81552479009789abe4b60d557f53ebd9d8f52578dc8549cca29f5880f12be
[./PDOX40/TUTILITY.CFG](./PDOX40/TUTILITY.CFG) | hash://sha256/c73ca4470263664a07398a447695669ec6e1bc323bc5d94f3fc2b70ef11936df
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.SET](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.SET) | hash://sha256/0291b9a3f85dbe7e5acf6a103dfb6656d2b72596731b5d0b572d1be08db7a677
[./PDOX40/biblio(backup%5B2010%5D)/H-FAM.F](./PDOX40/biblio(backup%5B2010%5D)/H-FAM.F) | hash://sha256/6032945aff6f2a22fd51b094a1140699874d12445926939924ec716510d56b8e
[./PDOX40/biblio(backup%5B2010%5D)/GENUS.F1](./PDOX40/biblio(backup%5B2010%5D)/GENUS.F1) | hash://sha256/9956107ae221e9ad073f9a5afcac46595a599771a4d78a738379b8df43c5fc51
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.PX](./PDOX40/biblio(backup%5B2010%5D)/MASTER.PX) | hash://sha256/eebcc87bc2e09e15ac22a45e3546972fd5bd40cd709da68b6669746227163477
[./PDOX40/biblio(backup%5B2010%5D)/REFS.F1](./PDOX40/biblio(backup%5B2010%5D)/REFS.F1) | hash://sha256/49f46da4e31fb1c56ed0150a9a5186bc96e6d97c1bfa18d4c415081f35d9349c
[./PDOX40/biblio(backup%5B2010%5D)/On-lineWWWaddresses.xls](./PDOX40/biblio(backup%5B2010%5D)/On-lineWWWaddresses.xls) | hash://sha256/50a93e75f466b8488dbe7ef38e4b5cec5e2c21ce4162f62d8e46f2e41569b38e
[./PDOX40/biblio(backup%5B2010%5D)/H-FAM.SET](./PDOX40/biblio(backup%5B2010%5D)/H-FAM.SET) | hash://sha256/8a0bae40ac93c2e5a6e0fce9ff06edbd1baa056c0220ccdbaacee36dc9167c4b
[./PDOX40/biblio(backup%5B2010%5D)/RELIABLE.F](./PDOX40/biblio(backup%5B2010%5D)/RELIABLE.F) | hash://sha256/63b024acb8aee86244d27083cea7d0795d34ae53020cf1f9d856d64d5c9332a4
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.SC](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.SC) | hash://sha256/ff118296dfb47411498100c540ecc3803d6d0b6b1cb08af2f67d6c30fb0aafaf
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.MB](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.MB) | hash://sha256/98404a0105550f304ac4bb6cc788d1b9e67bbeaa464b2798821fb674a6fc6a68
[./PDOX40/biblio(backup%5B2010%5D)/KEYWORDS.DB](./PDOX40/biblio(backup%5B2010%5D)/KEYWORDS.DB) | hash://sha256/68ce5f7ac565fe0526302bb8870ecb3b339f6ea8382300f69ce5da661e735aa4
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.PX](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.PX) | hash://sha256/4c17bf34a8164559e7f76dc1e2343a12a4000cdfc0a8f407d25954b81fd8d042
[./PDOX40/biblio(backup%5B2010%5D)/GENUS.PX](./PDOX40/biblio(backup%5B2010%5D)/GENUS.PX) | hash://sha256/319e20ac764281995813ae9e8a8079db508fcae1fb54d36efa188b461704fdde
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.F5](./PDOX40/biblio(backup%5B2010%5D)/MASTER.F5) | hash://sha256/da506215fbee57c465d3d450a78ca8e28d94ab9dc32aa05a0c8c0e80409fe881
[./PDOX40/biblio(backup%5B2010%5D)/REFS.DBF](./PDOX40/biblio(backup%5B2010%5D)/REFS.DBF) | hash://sha256/39d80f433113710de71e1c1defa6484b72a8c0611831f32e77235cb2bdceaea2
[./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.X05](./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.X05) | hash://sha256/2821d9d34fc3940ba74c52d4108688428c3265bd9a995ad4ac96226a2232c903
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.DB](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.DB) | hash://sha256/de43748c0e8b6ef02c6371de0be4f87e42664152b3920ccbe35ab98c3757758b
[./PDOX40/biblio(backup%5B2010%5D)/STATUS.DB](./PDOX40/biblio(backup%5B2010%5D)/STATUS.DB) | hash://sha256/6cfa042cbac9fcf10cddd70460596756326f3ad0862e36e150e23e6f5a8ca819
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F9](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F9) | hash://sha256/14d0a466d284b9b283544539d8ff59e1a5c33b69708a3459acc56cd3fd8e606f
[./PDOX40/biblio(backup%5B2010%5D)/FGNAMES.DB](./PDOX40/biblio(backup%5B2010%5D)/FGNAMES.DB) | hash://sha256/446b9681d77b4a6c7588ace069a8995dbccbea036c0d181d39b2666ce28dd148
[./PDOX40/biblio(backup%5B2010%5D)/GENUS.MB](./PDOX40/biblio(backup%5B2010%5D)/GENUS.MB) | hash://sha256/c47c685fbf7ed874c836fff1017c4b9bbe45bc35c3fe6f4ca005e481d14b3244
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.VAL](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.VAL) | hash://sha256/cf0bbef72b534657062b915978015a8e75258b22ce30edd6a0efedb6e9f3b9f2
[./PDOX40/biblio(backup%5B2010%5D)/RELIABLE.DB](./PDOX40/biblio(backup%5B2010%5D)/RELIABLE.DB) | hash://sha256/4e84cb86ed7c4b2224d1ecc8b3a37f6968949beb50a124ce8aadb50978f5906b
[./PDOX40/biblio(backup%5B2010%5D)/RELATION.DB](./PDOX40/biblio(backup%5B2010%5D)/RELATION.DB) | hash://sha256/a0666de7cb759d920b0c5d638bb22c0f95b8ba5149cd7ae0ae467183d55f4fdb
[./PDOX40/biblio(backup%5B2010%5D)/GENUS.VAL](./PDOX40/biblio(backup%5B2010%5D)/GENUS.VAL) | hash://sha256/90ea29d1c91ac9e3d8b454e2da12e07a6514e7a7c090f8a09daa82fbfc7366a3
[./PDOX40/biblio(backup%5B2010%5D)/TRAN.DB](./PDOX40/biblio(backup%5B2010%5D)/TRAN.DB) | hash://sha256/3548fd9e56977114762a179baf197aa5471fb134eda5b6113dccfd3d4a8b46f0
[./PDOX40/biblio(backup%5B2010%5D)/DIST.MB](./PDOX40/biblio(backup%5B2010%5D)/DIST.MB) | hash://sha256/ef223c373a1b0ad003ef229df9efdcf4b84237312120dcbda778b7081e77b690
[./PDOX40/biblio(backup%5B2010%5D)/EXTEND.PX](./PDOX40/biblio(backup%5B2010%5D)/EXTEND.PX) | hash://sha256/a2c7ad7ca26ee1058361545ecc3359c5fcddcaf6343d53a5d15eccb434dfa028
[./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.Y05](./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.Y05) | hash://sha256/6c75115a078647fd33917b298453ed72d773e3993e5bde623b59e33968682812
[./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.F2](./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.F2) | hash://sha256/17da020dc26d27aee6d7d66ccd376e72f17a142a1a5ec0becd550a35af57e8f4
[./PDOX40/biblio(backup%5B2010%5D)/JOURNREF.DB](./PDOX40/biblio(backup%5B2010%5D)/JOURNREF.DB) | hash://sha256/4b1df71d82147ab1fc5c75e6cc083a7e4e4d9135e4fe1ccf62794f5018009d33
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.YG2](./PDOX40/biblio(backup%5B2010%5D)/MASTER.YG2) | hash://sha256/5a943008562b98596ee6c258adb57bdb7211c3f2b8de7196f551f0f47f50161a
[./PDOX40/biblio(backup%5B2010%5D)/CRENCYRT.PX](./PDOX40/biblio(backup%5B2010%5D)/CRENCYRT.PX) | hash://sha256/32b8b8fc2f80ae1825b42497ab0ffcfa4c06420a5e429d4a3a59c31286f45090
[./PDOX40/biblio(backup%5B2010%5D)/HKNEW.MB](./PDOX40/biblio(backup%5B2010%5D)/HKNEW.MB) | hash://sha256/27e2f360fddcff1cf3f04eebfc535700cb0a3366985e13661d85667ee107e4e9
[./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.F](./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.F) | hash://sha256/c817febc46ed1dae83f376b828fbad31bf5f84f4e7718c316486ede82be41840
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F) | hash://sha256/570b190b9fdaa2b4356e935646d9598adbee6e332a59a6e2577d466405cf3606
[./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.DB](./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.DB) | hash://sha256/fa6223cae2720c99e707d18e0a03a12ac0819301ec9501993d8c683d71c974a7
[./PDOX40/biblio(backup%5B2010%5D)/REFLOOK.SC](./PDOX40/biblio(backup%5B2010%5D)/REFLOOK.SC) | hash://sha256/f66a0c1593dfc7d360f566b91db4c4b32c9c63715635190bc26623ba5625bdd6
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.DB](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.DB) | hash://sha256/16c59a7c0469e1df7b37dc96caa13250764cc4b45308628229dfdb0dff421c0c
[./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.SET](./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.SET) | hash://sha256/5f7bdc005f5490903238a5309c7902655fdfbb13e9e5f86bb2aee414695ac281
[./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.DB](./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.DB) | hash://sha256/7ea6b65797a9c23744ccaaeec2b48f3518615618c10e1b5befb1e023efc09d0d
[./PDOX40/biblio(backup%5B2010%5D)/MOVEHOST.SC](./PDOX40/biblio(backup%5B2010%5D)/MOVEHOST.SC) | hash://sha256/c89600d619c67d108b642c41708da0dab3a6bf317a2c1a313b8f26ad5f3eab98
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.XG0](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.XG0) | hash://sha256/ecf263dd8e099d1a731ebcc24d0ad5eef1c91111fd863e6bbc02eadb4091b8ef
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.X0A](./PDOX40/biblio(backup%5B2010%5D)/MASTER.X0A) | hash://sha256/3f085e023c63e0adad38be059264ed862fc85a7d187dbbf997e3c8ed26e50372
[./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.DB](./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.DB) | hash://sha256/e80ff849131cf293f1a4f39c3796a32775c185496e79e9f06b2eefc805d1aee5
[./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.Y05](./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.Y05) | hash://sha256/16b50abed11133dc7e2abc39ebe7c28076cc9d2548716e86ee03bb85792cd1a6
[./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.X05](./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.X05) | hash://sha256/999e06e86c848045ab5fa9986e3989c2f7bb85cf3a32747d9059e85f3d038d85
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST1.DB](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST1.DB) | hash://sha256/2a8f6e0fadcde2a65cf8da4def6254f697d9ac39a81f270ab06cbf7cfbcc4773
[./PDOX40/biblio(backup%5B2010%5D)/REFEXT.F](./PDOX40/biblio(backup%5B2010%5D)/REFEXT.F) | hash://sha256/11ea6be405fc2e81c8d9ae48f9ae50a9512c4154deacf00c3589a4486154820b
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST2.SC](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST2.SC) | hash://sha256/681675fba0016052580387e9ed9b11fa0d3ee9764036a2c82554d6eb86138b9c
[./PDOX40/biblio(backup%5B2010%5D)/DIST.SC](./PDOX40/biblio(backup%5B2010%5D)/DIST.SC) | hash://sha256/7705f19c17b7916a7c3700817f6ef9f5555d06f46242f6077b614ccb65f184a1
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.F](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.F) | hash://sha256/bac921dce0ccaa9bfaa9973457f53a99fd12f127cc7e9d4c4d443966ef9cf525
[./PDOX40/biblio(backup%5B2010%5D)/HOSPLANT.PX](./PDOX40/biblio(backup%5B2010%5D)/HOSPLANT.PX) | hash://sha256/d55ade5082775b9674b05e26116f6dea96110ac2a00a0b653f814ff6667cba5c
[./PDOX40/biblio(backup%5B2010%5D)/HOSPLANT.SET](./PDOX40/biblio(backup%5B2010%5D)/HOSPLANT.SET) | hash://sha256/997eca43cb42fbcaee753f14ea1a2906410902d260857f8a6d8cbc4afe663974
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS2.SC](./PDOX40/biblio(backup%5B2010%5D)/HOSTS2.SC) | hash://sha256/79df368184fb83fd92dcfdb8150c9aee250ee4605e71d241a426e9f0c649d711
[./PDOX40/biblio(backup%5B2010%5D)/GENUS.F7](./PDOX40/biblio(backup%5B2010%5D)/GENUS.F7) | hash://sha256/07d97af4a2a6a4a375f7c385e7fef85e7b403772d183c3bb6314aa75de175491
[./PDOX40/biblio(backup%5B2010%5D)/COLL.F](./PDOX40/biblio(backup%5B2010%5D)/COLL.F) | hash://sha256/060e103fabddcc33558f43bfc0632b14dd0fc8654e5707bb357da5f2931fba74
[./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.PX](./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.PX) | hash://sha256/c2d53077cac5558320688a3978b9d4dfed554d5df4c71f98ba36d7659b6aa2bd
[./PDOX40/biblio(backup%5B2010%5D)/REFEXT.DB](./PDOX40/biblio(backup%5B2010%5D)/REFEXT.DB) | hash://sha256/aea34538f32bdf2c30eb90e63f5e26e9956d9353b7fe4cb33bf0aa899c5603b1
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST1.PX](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST1.PX) | hash://sha256/ac2c4772cfe5a62981a86d3ec8718daa0a0f5c30c0ea01a4bf57daf0ece418f1
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F5](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F5) | hash://sha256/81ad7af11a44ced1baf7faa12f0b8c2cd1812c41744f3b069245bc660d846270
[./PDOX40/biblio(backup%5B2010%5D)/TSTAT.F](./PDOX40/biblio(backup%5B2010%5D)/TSTAT.F) | hash://sha256/e79249ea45fd8db965f55b6456ec1dd9d7d8de79317a5be1039a3560f5fbe6b2
[./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.F](./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.F) | hash://sha256/a8dc76312b156c9e58a743d14278f4577c9d8a0c00a8bf9adfb0a401cb19fb82
[./PDOX40/biblio(backup%5B2010%5D)/P-TYPE.DB](./PDOX40/biblio(backup%5B2010%5D)/P-TYPE.DB) | hash://sha256/6e597da20911be85502d371c68a9bdf43ada96a1a5075d469a04b6ffd593efb4
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F2](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F2) | hash://sha256/c6b94cc340b3eed44419e611f3f573418707882b45723f3ef3d25ebb7d53f7c9
[./PDOX40/biblio(backup%5B2010%5D)/REFNEW.SC](./PDOX40/biblio(backup%5B2010%5D)/REFNEW.SC) | hash://sha256/4319bda283df8da0219107f1c6a65b76b288d02e2051285d0e6858644f08e4df
[./PDOX40/biblio(backup%5B2010%5D)/KEYWORDS.SET](./PDOX40/biblio(backup%5B2010%5D)/KEYWORDS.SET) | hash://sha256/e4272214a3661764649cc20afbfea2ef99163955c16f9e279c534c199cb7d0ea
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F1](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F1) | hash://sha256/e959d36197ea243c12674e7efb0093231a7ccb1f99744c503ae6995873b142ef
[./PDOX40/biblio(backup%5B2010%5D)/INIT.SC](./PDOX40/biblio(backup%5B2010%5D)/INIT.SC) | hash://sha256/359c2037855c0ea247e12eb5432b7ac27d8cb3928e44472828362c34119198e9
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.DB](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.DB) | hash://sha256/2bafb2bb21388357e47da0707d324bb804ac4ab8e514ccb788a0e5d3ced5dd1f
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.SET](./PDOX40/biblio(backup%5B2010%5D)/MASTER.SET) | hash://sha256/0858acd094b13ab4b9a553adc9e800520d915af15e36478537ed64c5c5841a68
[./PDOX40/biblio(backup%5B2010%5D)/FGNAMES.SET](./PDOX40/biblio(backup%5B2010%5D)/FGNAMES.SET) | hash://sha256/dd6974f9dea2bd469f257b8fe2d102e5e980441f6063afdf5a892428aff97e4f
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.Y0B](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.Y0B) | hash://sha256/6ce0616c1d4216f5fc2d90f6b7a6e0df108ad0b25678a9f9faf1e6afafb72977
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.BAT](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.BAT) | hash://sha256/1191355740c99300024b96247f4f4fc01e5ee7b26a6e5a6ec824bf9b19a4a7c3
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.XG2](./PDOX40/biblio(backup%5B2010%5D)/MASTER.XG2) | hash://sha256/e0619b83d61e829bf22bbf2a142ca58bd4bb17a9abba7e2f0779649e71987238
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.PX](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.PX) | hash://sha256/a55393a1d04393ee165a9ded4816a492864fe5d6d254382bd0d1dce62101734a
[./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.MB](./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.MB) | hash://sha256/d0625d17e797266770e3fd4ed51edffd06f004aedcec366e9c13c0146e35e523
[./PDOX40/biblio(backup%5B2010%5D)/KEYWORDS.F](./PDOX40/biblio(backup%5B2010%5D)/KEYWORDS.F) | hash://sha256/9267746a05ce6c1513e582abe99e51194bc57d6aa3fdc4160d8f334387a7bd76
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.PX](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.PX) | hash://sha256/cdc35b3e9e0c0858c8e22dd714c219ae9ffc7680d5b4ae0242eade0a8e968a23
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.Y02](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.Y02) | hash://sha256/00fa7a7c27c2063e3b5540c866f9d2e55709d7ef8710d8c1443a499606c7b0d7
[./PDOX40/biblio(backup%5B2010%5D)/HKNEW.PX](./PDOX40/biblio(backup%5B2010%5D)/HKNEW.PX) | hash://sha256/75b59ee93539f21bddc4bcf629e67865ff60464528160fb6598c78190e79d0b4
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.F2](./PDOX40/biblio(backup%5B2010%5D)/MASTER.F2) | hash://sha256/fc8503020c5da064916f68b02e04aa2f8435dbf0290cff11e6c0fc6e708e7c32
[./PDOX40/biblio(backup%5B2010%5D)/TSTAT.VAL](./PDOX40/biblio(backup%5B2010%5D)/TSTAT.VAL) | hash://sha256/bf36e4bff2a5d059c1d402301b5502c6c5e9dc8605736da6131bd155c2dcca5d
[./PDOX40/biblio(backup%5B2010%5D)/REFS.VAL](./PDOX40/biblio(backup%5B2010%5D)/REFS.VAL) | hash://sha256/3163682feb39a79980e9c7aff47f0da91f7a598255c619c7bdfb20a79dea14e7
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.Y05](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.Y05) | hash://sha256/edc35db61816133ac042a24c5a6e4edf5f4c545b457806d198a6153e3c7f0d86
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.F4](./PDOX40/biblio(backup%5B2010%5D)/MASTER.F4) | hash://sha256/e42dd6ac95ae993804b7bcb104c225373d1143fb0dd0668250a10ac814e98f55
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.F](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.F) | hash://sha256/3b625bddb21dc897b15ccef79a4c223f7f2bcc338e7603e641665906f3298570
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F2](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F2) | hash://sha256/28cb7c6b743b2034e580168bdc8fd267e5f2fe36c022d11c8c59cb8ea3f0b4d5
[./PDOX40/biblio(backup%5B2010%5D)/COPYREF.SC](./PDOX40/biblio(backup%5B2010%5D)/COPYREF.SC) | hash://sha256/167cfea567faf6de89cb780066267e7490e7550a23b1182f4c2fb9c3d8537168
[./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.F](./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.F) | hash://sha256/6c51c9018100e89922089904d3e08b8e68697446cc805430dca06692bc145d54
[./PDOX40/biblio(backup%5B2010%5D)/COUNTRY.F](./PDOX40/biblio(backup%5B2010%5D)/COUNTRY.F) | hash://sha256/2f2f1bb47fcc991178436191b3d446c898aa5b95051b98bd42e57c6bc7e1d0f4
[./PDOX40/biblio(backup%5B2010%5D)/REFS.SET](./PDOX40/biblio(backup%5B2010%5D)/REFS.SET) | hash://sha256/59d14e80cf43c23eaad7c4311de56d7ad8874ce5eef6266a8471fc56b40728a7
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.F3](./PDOX40/biblio(backup%5B2010%5D)/MASTER.F3) | hash://sha256/a092feed8b1a0f58fc1a049e04b9b8e0dd375bdff5640dd238cc738b536eca87
[./PDOX40/biblio(backup%5B2010%5D)/DIST.DB](./PDOX40/biblio(backup%5B2010%5D)/DIST.DB) | hash://sha256/8c019810e7719c73ba05d77116fd4cdf6f75b5e67fe685fb9687193c3bd510f3
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST1.SC](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST1.SC) | hash://sha256/2bdad5937f77144dd3e9ac10b6a92408e591603c77c3b49ca105eed26442c4ed
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.X05](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.X05) | hash://sha256/a6fe15b2a76cf58416bf4acf3f5d583e66c731b18a0519171236cdcc6aae2ce9
[./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.VAL](./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.VAL) | hash://sha256/9099f6a9ede62374e86974ee0e31f1e73a5b040cc890cdde5f946eb8e8ab24d4
[./PDOX40/biblio(backup%5B2010%5D)/FGNAMES.PX](./PDOX40/biblio(backup%5B2010%5D)/FGNAMES.PX) | hash://sha256/5d090d86c056c9db69c4d9690e4453c017afa2b0cbbf66208af4346b1feba6d6
[./PDOX40/biblio(backup%5B2010%5D)/REFALTER.SC](./PDOX40/biblio(backup%5B2010%5D)/REFALTER.SC) | hash://sha256/ee315536b88facec6788546aa90c62bc96da32d16c991187b1c3e53f9b8bed49
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F4](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F4) | hash://sha256/c90a7eab723bb98b3fb65a77a39ef9ae97bbd07de6ce76415a34fac15c12677c
[./PDOX40/biblio(backup%5B2010%5D)/REFS.XG0](./PDOX40/biblio(backup%5B2010%5D)/REFS.XG0) | hash://sha256/df0a208f1a577e79f68819ce84991294e8ec0ae615ecedbd3e9179317a31bdb3
[./PDOX40/biblio(backup%5B2010%5D)/COUNTRY.DB](./PDOX40/biblio(backup%5B2010%5D)/COUNTRY.DB) | hash://sha256/6f85bc697dd054e6253c4ddd00d19532f70aecb3b1d9b49e734abb3bd9301974
[./PDOX40/biblio(backup%5B2010%5D)/LANGUAGE.DB](./PDOX40/biblio(backup%5B2010%5D)/LANGUAGE.DB) | hash://sha256/4dd887d913a7ed101ba220045ab610c998d2bcf40a079a8d7424d4550bca293b
[./PDOX40/biblio(backup%5B2010%5D)/HOSPLANT.F](./PDOX40/biblio(backup%5B2010%5D)/HOSPLANT.F) | hash://sha256/e61aa39038dfaa7e28c859c7ad94e73b06507082c979074f61a23b18424bc503
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.VAL](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.VAL) | hash://sha256/0392ba36544c53f46ce34be7de87536e8634fa933d714917ecceaeee6830ab9e
[./PDOX40/biblio(backup%5B2010%5D)/FAMNAMES.DB](./PDOX40/biblio(backup%5B2010%5D)/FAMNAMES.DB) | hash://sha256/ed463207afd58b5203b39ac720498afc70a0aaafa20a9c359d62ae70fec272e8
[./PDOX40/biblio(backup%5B2010%5D)/DIST.VAL](./PDOX40/biblio(backup%5B2010%5D)/DIST.VAL) | hash://sha256/61d3035b53314247d0aac53cd412ff173067bbbfbb3eff7991071446d21329b9
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F) | hash://sha256/7441ccab3698c39685b6f2ddfe6e359b4e97cabdbccd5599eee38886cfe5daa3
[./PDOX40/biblio(backup%5B2010%5D)/REFS.F2](./PDOX40/biblio(backup%5B2010%5D)/REFS.F2) | hash://sha256/9dc516277b64493b5493ff658751591ec5bd1e1eb906c9b8958a163a4817059f
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F7](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F7) | hash://sha256/64a88de3c08eeb78acce3db3dd6257a14852ed8ee356537d92c751437dd83459
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.F2](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.F2) | hash://sha256/8e4ffec0c026cb9c76a937e04a82e714c86dca773fe8675fd01d7ba54035a9d3
[./PDOX40/biblio(backup%5B2010%5D)/JOURCOPY.SC2](./PDOX40/biblio(backup%5B2010%5D)/JOURCOPY.SC2) | hash://sha256/7c2a8a96993fcf9197e7cde619acdd3afb3eee3187711b40ba372d1968bbdf32
[./PDOX40/biblio(backup%5B2010%5D)/REFNEW.SC2](./PDOX40/biblio(backup%5B2010%5D)/REFNEW.SC2) | hash://sha256/f8caa97939e0ca243c6153895b9eef998d835b576138d9a7a97ef9063f32a116
[./PDOX40/biblio(backup%5B2010%5D)/JOURNEXT.DB](./PDOX40/biblio(backup%5B2010%5D)/JOURNEXT.DB) | hash://sha256/3f5e61a4688660771fa78d846b84e9d199c054e7e48997c52e4d83a059648267
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.X10](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.X10) | hash://sha256/e5fcdf0ce2c9cb926970f4199466c11cd6f6c6559bbc8d30cf812bf7ea978606
[./PDOX40/biblio(backup%5B2010%5D)/EXTEND.F](./PDOX40/biblio(backup%5B2010%5D)/EXTEND.F) | hash://sha256/a3e5cce80784b95ab196ccef5d0d903cd53bcebd459f5ea9d9596f08d46962ef
[./PDOX40/biblio(backup%5B2010%5D)/chalref.doc](./PDOX40/biblio(backup%5B2010%5D)/chalref.doc) | hash://sha256/d1850d1a05b8e9c297784e8e89fac86344d1491a21452092b4df94ab48fa4c84
[./PDOX40/biblio(backup%5B2010%5D)/REFS.PX](./PDOX40/biblio(backup%5B2010%5D)/REFS.PX) | hash://sha256/7cc6e49c96baa7513484d31e7fca1811a970862bb65a63921231ec5d8b439690
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.PX](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.PX) | hash://sha256/f4258e48cdb1f5d722069733e6858b34bbcc81f20c0bd89bca17bc6b0cb834ee
[./PDOX40/biblio(backup%5B2010%5D)/GENUS.F](./PDOX40/biblio(backup%5B2010%5D)/GENUS.F) | hash://sha256/fbb1b05824db5c608f22ffb941379eb616ddb863921e5ffc2c0ab2a045999ea9
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.VAL](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.VAL) | hash://sha256/a4dc77986c6573f654b82f098908968328714546ef52cb7e82c22d6837d3897f
[./PDOX40/biblio(backup%5B2010%5D)/REFNEW.F](./PDOX40/biblio(backup%5B2010%5D)/REFNEW.F) | hash://sha256/bed5b64861cf0e8ae30ca15f52238d3130864822898dbc6bb4a359f3d9696e29
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F6](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F6) | hash://sha256/5ad1359a46fae6e36b8a048ac0ab7b1d65679dd9169178f016c0ff15e176d94d
[./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.X02](./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.X02) | hash://sha256/ca624294c9a02f18ab4eda4dd49697be8033573c868c76c83ecdfc1cf6f43453
[./PDOX40/biblio(backup%5B2010%5D)/EXTEND.DB](./PDOX40/biblio(backup%5B2010%5D)/EXTEND.DB) | hash://sha256/d6bd975bb20d642f9dd1aba8a5ef1e683f5cb4d375cf757b1baeae7f6bf7398d
[./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.F1](./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.F1) | hash://sha256/dc3aa6458ab089e7b9e8ad20ca049f00a02cf541ad0735589399a8b0a0536aae
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F1](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F1) | hash://sha256/6c5ec376f4a2e25477e03835beecf7edb6a62bfb1fb8c1e9ae24d16485406fda
[./PDOX40/biblio(backup%5B2010%5D)/PROTREC.SC](./PDOX40/biblio(backup%5B2010%5D)/PROTREC.SC) | hash://sha256/733e477ba696287aae1734508e3d86d83eab1d657b7c46857d7cc62a30e5a407
[./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.MB](./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.MB) | hash://sha256/0f4ef8539a16209f798ca90dd9b86b4eeea348440dd9297e6e28327809cdee7c
[./PDOX40/biblio(backup%5B2010%5D)/DIST.F](./PDOX40/biblio(backup%5B2010%5D)/DIST.F) | hash://sha256/ebaeb8189c99858596d456972d05e2e58c06493d6ec8f5859d5d6a04438aae24
[./PDOX40/biblio(backup%5B2010%5D)/MOVEHOST.SC2](./PDOX40/biblio(backup%5B2010%5D)/MOVEHOST.SC2) | hash://sha256/544291054a4765358153dbad6a67db761929756854e1401fbb658d883003f931
[./PDOX40/biblio(backup%5B2010%5D)/P-TYPE.PX](./PDOX40/biblio(backup%5B2010%5D)/P-TYPE.PX) | hash://sha256/01bf11461f92dc299e8d458c9ede9193b4afbe567d44a7b912abe2f6ffc88ecf
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST1.F](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST1.F) | hash://sha256/e7b5e6cb4f6c88f31dc1f07ccde0c34c87fc9e2e9717f38bb9fefe04cfed6a99
[./PDOX40/biblio(backup%5B2010%5D)/RELATION.PX](./PDOX40/biblio(backup%5B2010%5D)/RELATION.PX) | hash://sha256/9834d8a0e5cd3ebb8038e8d281c0b1751b948307e13b281a198f6946400e0bdc
[./PDOX40/biblio(backup%5B2010%5D)/GENUS.F2](./PDOX40/biblio(backup%5B2010%5D)/GENUS.F2) | hash://sha256/9956107ae221e9ad073f9a5afcac46595a599771a4d78a738379b8df43c5fc51
[./PDOX40/biblio(backup%5B2010%5D)/INSTANT.SC](./PDOX40/biblio(backup%5B2010%5D)/INSTANT.SC) | hash://sha256/37d201457763cb2da5e38588cd93a39b5bce75bbeb2dc03c2c5d2cf5e32bd108
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.MB](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.MB) | hash://sha256/2dc3261301e910ba700a0cecacc0b2711ece384cf9e41d3dfc0f77e0f90313b3
[./PDOX40/biblio(backup%5B2010%5D)/RELIABLE.R](./PDOX40/biblio(backup%5B2010%5D)/RELIABLE.R) | hash://sha256/d67a407c2ce21c53d42fb0da6eaa3a40f8be115054d5fbb8b96b8d3148922188
[./PDOX40/biblio(backup%5B2010%5D)/JOURNREF.F](./PDOX40/biblio(backup%5B2010%5D)/JOURNREF.F) | hash://sha256/cb66b7245989769e27fb9f51ea53992b21824fd2da76a3bc4d07e30008d9d17c
[./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.F](./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.F) | hash://sha256/43450b79c6a49ab7e13e44422ac28e8733313a921c0a9d109b27ab0447497d09
[./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.PX](./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.PX) | hash://sha256/06539fbd40c02c2732b820c78daf71291056ef673220859fac389c92b47e8f70
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.F](./PDOX40/biblio(backup%5B2010%5D)/MASTER.F) | hash://sha256/69a737462a81063fcf9db6189fc44fab14644b37a260cc7d4fd46e5b335187aa
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.DB](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.DB) | hash://sha256/debfae7ad7bf9108d6a52357f2c253030446507ccb5f84d93c50b131274ea4b1
[./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.F](./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.F) | hash://sha256/b502be54cd2efbc71574ff0383eff5b400b3c1703662569ea678aa879477edac
[./PDOX40/biblio(backup%5B2010%5D)/CRENCYRT.R](./PDOX40/biblio(backup%5B2010%5D)/CRENCYRT.R) | hash://sha256/5ceab47128298b9c01549242054b1ce3234242a907831de67d417fea1d25790c
[./PDOX40/biblio(backup%5B2010%5D)/TSTAT.F1](./PDOX40/biblio(backup%5B2010%5D)/TSTAT.F1) | hash://sha256/c01fc3a64a409d643e786647412b2745e4b67afdd8677ff11d404c6fa2da99a2
[./PDOX40/biblio(backup%5B2010%5D)/FAMNAMES.PX](./PDOX40/biblio(backup%5B2010%5D)/FAMNAMES.PX) | hash://sha256/104ed460e7d19e9c6fd926be097c4970b6a25e49174ce16e391347a9ebcf411f
[./PDOX40/biblio(backup%5B2010%5D)/HKNEW.DB](./PDOX40/biblio(backup%5B2010%5D)/HKNEW.DB) | hash://sha256/5089cf91cd5bffac22284c74f9ad4daaa6101ac3afe063942157996e4331aa44
[./PDOX40/biblio(backup%5B2010%5D)/TEMP.DB](./PDOX40/biblio(backup%5B2010%5D)/TEMP.DB) | hash://sha256/9d7f5a377a9d10103d3aa0510ff37dab2c4413cde32d8b8c1435eb5778e2c60a
[./PDOX40/biblio(backup%5B2010%5D)/REFNEW.Y07](./PDOX40/biblio(backup%5B2010%5D)/REFNEW.Y07) | hash://sha256/e38e047a83b7f6f03cefb38b6ae98736c2684428b3de111c41f6b788b4bb7bb8
[./PDOX40/biblio(backup%5B2010%5D)/JOURNEXT.F](./PDOX40/biblio(backup%5B2010%5D)/JOURNEXT.F) | hash://sha256/c33b6de73eb6949d4541b8629677d38511bd702374e72b6502c95bfbc5b25bd2
[./PDOX40/biblio(backup%5B2010%5D)/TSTAT.DB](./PDOX40/biblio(backup%5B2010%5D)/TSTAT.DB) | hash://sha256/5d0b0541eb44e3c851f6307884de72b9522fb67333d45a23bc8a5d7716466582
[./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.Y03](./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.Y03) | hash://sha256/a22635eeb6dbea30e343d5817fa4247c6466218b7e412146effc84a127c83430
[./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.R](./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.R) | hash://sha256/fb0e621f39176844c7ccb6602c3755af5cc8297cce763c2f06b14cdb2c916f59
[./PDOX40/biblio(backup%5B2010%5D)/H-FAM.DB](./PDOX40/biblio(backup%5B2010%5D)/H-FAM.DB) | hash://sha256/630ee380f9c3b56cd6625fc4b79b0f71615d8d0d83557c0c20483916900d8ccc
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F3](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F3) | hash://sha256/cd9fed466535e913d967b75917311e777924abffe5fcaaac45adf19c04056790
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.DB](./PDOX40/biblio(backup%5B2010%5D)/MASTER.DB) | hash://sha256/2540ee9b9dde43d7933f420223303c60dc7a33c6a674c4e3955078d2d63794b3
[./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.Y02](./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.Y02) | hash://sha256/d3b6dd7d0ed75f56e6839d85cee5215492f26d82ff144169714291ceebec0596
[./PDOX40/biblio(backup%5B2010%5D)/CHANGE.SC](./PDOX40/biblio(backup%5B2010%5D)/CHANGE.SC) | hash://sha256/e7197dde63e9b905ce4acc09c3c4a95b9a8fe66b87fc746497ccba3881858485
[./PDOX40/biblio(backup%5B2010%5D)/INST.SC](./PDOX40/biblio(backup%5B2010%5D)/INST.SC) | hash://sha256/4fcde9afd47fdc8f3232b75385e8f5621e62bb4130b4e5957a7bd4fee42ac6cf
[./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.PX](./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.PX) | hash://sha256/a670c20b9b4db9ecff459df3f3ff5b19d9f46c8180e0633c6233ad387f0eefdc
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.XG0](./PDOX40/biblio(backup%5B2010%5D)/MASTER.XG0) | hash://sha256/6bd203c86e11d77cf7ce6e92477ecad79e1a922abbbedd42275b439a181b5989
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.YG0](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.YG0) | hash://sha256/c7af2420fbbd7dcb378ddaa9596f0c7997bede7840589cb4018650829b02a01a
[./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.F1](./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.F1) | hash://sha256/44ed8225a9c2c492a24d27e002e93c53fb969b44101e29c35006d688cd18aece
[./PDOX40/biblio(backup%5B2010%5D)/HOSPLANT.DB](./PDOX40/biblio(backup%5B2010%5D)/HOSPLANT.DB) | hash://sha256/e366b3737f2bbb98795bb36eaf3bd07282fdfd2552136e87a6d1f87859006863
[./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.DB](./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.DB) | hash://sha256/fb46f0f4fec3c63fa921e381e756133f9f44ecd531028d56e60fb0bb9a51d0d8
[./PDOX40/biblio(backup%5B2010%5D)/DIST.YG0](./PDOX40/biblio(backup%5B2010%5D)/DIST.YG0) | hash://sha256/b0a7289ca80ecb025be65111a75a8a25c240295a89ad1a27cdfb2c72a6aac3f7
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F10](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F10) | hash://sha256/5c6679ed0bc40d9866ececf16f55c17c3d2de12868de070913ac7f4650bbfd5b
[./PDOX40/biblio(backup%5B2010%5D)/REFALTER.SC2](./PDOX40/biblio(backup%5B2010%5D)/REFALTER.SC2) | hash://sha256/bb29279fd7ce4841475465bb860f21cbcb2a8c93c631fb41553d88eab7255d25
[./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.PX](./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.PX) | hash://sha256/0dde3c2ff1ce54476c698ba5417eb28253d43f0f71748b2b77dcf170d1d9ee74
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F3](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F3) | hash://sha256/ffe17d7cc091d083b499a970d2f656675a0993a6e2c974087f4b8e5cc75b2120
[./PDOX40/biblio(backup%5B2010%5D)/STATUS.PX](./PDOX40/biblio(backup%5B2010%5D)/STATUS.PX) | hash://sha256/7570127cd40dddc48c4edd00017207da0f354a06245f52b5b84be16bfedf631a
[./PDOX40/biblio(backup%5B2010%5D)/P-TYPE.RPT](./PDOX40/biblio(backup%5B2010%5D)/P-TYPE.RPT) | hash://sha256/92bee9f076039417306c54b596c6efa496a73e8f967c9caa3f74ce379dd969f8
[./PDOX40/biblio(backup%5B2010%5D)/REFNEW.PX](./PDOX40/biblio(backup%5B2010%5D)/REFNEW.PX) | hash://sha256/853fed5ca4e24fe212d0adba4d859adc2c10e673070f418768e87590272c82c4
[./PDOX40/biblio(backup%5B2010%5D)/KEYWORDS.R](./PDOX40/biblio(backup%5B2010%5D)/KEYWORDS.R) | hash://sha256/3e81a2952432f50e2ff6664c225d86df0fa9669d1ce1d3b9e3c847fee84683a9
[./PDOX40/biblio(backup%5B2010%5D)/SERVER.BAT](./PDOX40/biblio(backup%5B2010%5D)/SERVER.BAT) | hash://sha256/a2f07e894ddf7e60aaaa9f361a6726504dfa7ed409378e839ec9c1d83e85cda9
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.X0B](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.X0B) | hash://sha256/886f5bef219628fcb89e973c1b3a44aa14c41801970c8292ccc12770e79b9a19
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.XG0](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.XG0) | hash://sha256/c4cee85eef48eee8433f1fecf7c81fdd27ede611366c2751ba350f26e3bf203e
[./PDOX40/biblio(backup%5B2010%5D)/COPYREF.SC2](./PDOX40/biblio(backup%5B2010%5D)/COPYREF.SC2) | hash://sha256/500c6838825481889cad5bd2c9bfb55fed618351180a2f469bbdc8eb3efbb396
[./PDOX40/biblio(backup%5B2010%5D)/REFNEW.VAL](./PDOX40/biblio(backup%5B2010%5D)/REFNEW.VAL) | hash://sha256/5c86de204fb0ac4d69378b5e9c11036c0b431a645257e35a77192786c4bb1074
[./PDOX40/biblio(backup%5B2010%5D)/COLL.DB](./PDOX40/biblio(backup%5B2010%5D)/COLL.DB) | hash://sha256/0aa5d627d1ae09ab4982e4a73001379b03e307e5941e19d994c25fa6df64eccb
[./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.R1](./PDOX40/biblio(backup%5B2010%5D)/WWWIMAOK.R1) | hash://sha256/86d14318ee92c8e87e9a85f5856c0a53e852fef8509e8eef52722097491010f5
[./PDOX40/biblio(backup%5B2010%5D)/TSTAT.PX](./PDOX40/biblio(backup%5B2010%5D)/TSTAT.PX) | hash://sha256/58735f8be9e953c7c6b0547494d59d555f16e75ac7c3ebd65077383aecf2b9e9
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.Y10](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.Y10) | hash://sha256/eb2273dea18a7966dc97cbe79b8cca751bf1a751820e01710c333650a892c8cb
[./PDOX40/biblio(backup%5B2010%5D)/REFS.F](./PDOX40/biblio(backup%5B2010%5D)/REFS.F) | hash://sha256/01909c6aabd6be7f1b7c3254a26e3761b90124e05f0b2e4b5e0fbe91840acae0
[./PDOX40/biblio(backup%5B2010%5D)/DIST.F1](./PDOX40/biblio(backup%5B2010%5D)/DIST.F1) | hash://sha256/2a626eee3a38fd416799dbc6ab0a8afd465f0f9732c177373fca6f571a91130e
[./PDOX40/biblio(backup%5B2010%5D)/PDOXUSRS.NET](./PDOX40/biblio(backup%5B2010%5D)/PDOXUSRS.NET) | hash://sha256/397cccaf6edb7813bf4146f9e2c407663535c45d78ba03618f053e7aa076f214
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F4](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.F4) | hash://sha256/74c28afc0e0e9eef0118adcd712c733cb4aeb9398110aa16debb7f1f01d19a49
[./PDOX40/biblio(backup%5B2010%5D)/JOURCOPY.SC](./PDOX40/biblio(backup%5B2010%5D)/JOURCOPY.SC) | hash://sha256/aa8b92d2e58bc0cd75086759b6ef28e4da8adf23d4d6dad9496476d94b972cd4
[./PDOX40/biblio(backup%5B2010%5D)/TEMP.PX](./PDOX40/biblio(backup%5B2010%5D)/TEMP.PX) | hash://sha256/4deb0220ae39e79a905afe2144021e23304308ccc570ac3f412950b416585af1
[./PDOX40/biblio(backup%5B2010%5D)/DIST.XG0](./PDOX40/biblio(backup%5B2010%5D)/DIST.XG0) | hash://sha256/5f449d607ed5fc907663e5325d079a77d35789fc6197fec6e542c382b2203dbd
[./PDOX40/biblio(backup%5B2010%5D)/CRENCYRT.DB](./PDOX40/biblio(backup%5B2010%5D)/CRENCYRT.DB) | hash://sha256/ef4ff262f5f38dadbd06cbdbe7a3e250d42448cc0a628e6b0a437a00c9d834ec
[./PDOX40/biblio(backup%5B2010%5D)/HKNEW.VAL](./PDOX40/biblio(backup%5B2010%5D)/HKNEW.VAL) | hash://sha256/d897201d18cee232f9981d03c4e37199fdf7fa2da4b3944691621959b1283dce
[./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.DB](./PDOX40/biblio(backup%5B2010%5D)/FAMTRIB.DB) | hash://sha256/fc20c512d0b773251d4ddcf1c6dd7a7ad5f9b494772974336e2e5dfa073c80d3
[./PDOX40/biblio(backup%5B2010%5D)/DIST.F2](./PDOX40/biblio(backup%5B2010%5D)/DIST.F2) | hash://sha256/b4537a4a9fa8888567b70ccf64019951e1fb46af2c804ba04687942db0ae0612
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.F1](./PDOX40/biblio(backup%5B2010%5D)/MASTER.F1) | hash://sha256/6207faaccc79cb626a6f19ea3cdd7f22a585422f8a168ee1d67b6f243dfed02c
[./PDOX40/biblio(backup%5B2010%5D)/DIST.PX](./PDOX40/biblio(backup%5B2010%5D)/DIST.PX) | hash://sha256/b961e0fbc957397d6059251856a0f9e4c91a6224ff3f6c3e7a73da5700caea95
[./PDOX40/biblio(backup%5B2010%5D)/FAMPLANT.R](./PDOX40/biblio(backup%5B2010%5D)/FAMPLANT.R) | hash://sha256/05807911ea6c63bd09c4077e1b345582b433d94847a8bfb03b8ed7e50a2440e1
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.DB](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.DB) | hash://sha256/983f303c209cc37dfe38212d0ada8842efbe500d1501f83c83ee71385ef90eb9
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.MB](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.MB) | hash://sha256/68271eb073b54f650f6b8bdc0b72a2aaaf8839f113e399201380ef397dcfeefa
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.F3](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.F3) | hash://sha256/d57063fe88d26bb8d0108c9c25468ad4f3054282e4ec86fa4586a742f4ff1731
[./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.SC2](./PDOX40/biblio(backup%5B2010%5D)/NEWHOST.SC2) | hash://sha256/c07378421ac8bbd81fe798b4786e24fc3e6e56e1b6b9e051515fa9db5f3d851e
[./PDOX40/biblio(backup%5B2010%5D)/HKNEW.F](./PDOX40/biblio(backup%5B2010%5D)/HKNEW.F) | hash://sha256/62610d37748063d56f64375a9a74653227e02ab3d75fda2ba6ca74362b50136e
[./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.PX](./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.PX) | hash://sha256/e73bc7e53fab9f739576c47c29c2efd321400f5b2cd431b9112f9127508ef683
[./PDOX40/biblio(backup%5B2010%5D)/REFNEW.DB](./PDOX40/biblio(backup%5B2010%5D)/REFNEW.DB) | hash://sha256/40da77f3b5e08acf4e664d0ad5ed3cb493d8642a73793fba83d92eab08a2f76e
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.YG0](./PDOX40/biblio(backup%5B2010%5D)/MASTER.YG0) | hash://sha256/b7fc1c2fc50440ff831b10fb4969d390c203de3c8ec6df60eb6a307ef5c7f426
[./PDOX40/biblio(backup%5B2010%5D)/TSTAT.MB](./PDOX40/biblio(backup%5B2010%5D)/TSTAT.MB) | hash://sha256/3bd8411786ee9960d19fa55fea035af542b384860e28cca1ddfbb791e9a29c63
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.YG1](./PDOX40/biblio(backup%5B2010%5D)/MASTER.YG1) | hash://sha256/481a8c6f46da99a86a951d3cdf5ce089bf82d21c096c97d5a346cce3a40415cf
[./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.VAL](./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.VAL) | hash://sha256/355b67b0e9882aa3d9a9fff2506b2fe90fd34e742aaf4b2724a5a7cb3f0ca674
[./PDOX40/biblio(backup%5B2010%5D)/REFNEW.X07](./PDOX40/biblio(backup%5B2010%5D)/REFNEW.X07) | hash://sha256/16df2fa162c634265dc315378fa5e6d56bb38df5c8e3b68dfb47e7e66b4ca628
[./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.VAL](./PDOX40/biblio(backup%5B2010%5D)/HOSTFAM.VAL) | hash://sha256/8fdeff0c36248e0e5242f86618aa82331729601c1af5b8e29fe6ce9ec6b3dab4
[./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.SET](./PDOX40/biblio(backup%5B2010%5D)/DISTOLIN.SET) | hash://sha256/16c11508200864851d45c6e1e8c1b2d5fefabef0931d9263d3e6cd878113fed9
[./PDOX40/biblio(backup%5B2010%5D)/FAMPLANT.DB](./PDOX40/biblio(backup%5B2010%5D)/FAMPLANT.DB) | hash://sha256/3b5bc81519c7aaa1ada88b16aa1ab17156540b64fc49356f8310557c319d7add
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.XG1](./PDOX40/biblio(backup%5B2010%5D)/MASTER.XG1) | hash://sha256/0a2d73417f01acf0031e6c8f9b2cf603146bb12af106965f5640e8fa0e86c811
[./PDOX40/biblio(backup%5B2010%5D)/HOSTNEW.SC](./PDOX40/biblio(backup%5B2010%5D)/HOSTNEW.SC) | hash://sha256/4ca7f6177e0e9e07f56eaa5dfcf34c3dd7241dfe3cf8a7f16b38b1b3e85a8fee
[./PDOX40/biblio(backup%5B2010%5D)/CHANGE.SC2](./PDOX40/biblio(backup%5B2010%5D)/CHANGE.SC2) | hash://sha256/9e205d740bc5a1e6be6d5548d7f705b6d0b358f3258c49012c7b1de7e7c58500
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.PX](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.PX) | hash://sha256/a02c6f1114aa77f806dbf3a14d0f0358ad76464ff40f1f93f5a164e4ca2d2bb8
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.Y0A](./PDOX40/biblio(backup%5B2010%5D)/MASTER.Y0A) | hash://sha256/b4ccd652966d25a138604787df3eeb2b3d7b4638d58fbb8a1e3bae3d2db260dc
[./PDOX40/biblio(backup%5B2010%5D)/REFEXT.PX](./PDOX40/biblio(backup%5B2010%5D)/REFEXT.PX) | hash://sha256/a0971f84a0cce012c486c3bb4b79c5393e8547c3507ad35f1a99f26c3153d83d
[./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.X03](./PDOX40/biblio(backup%5B2010%5D)/HKOLIN.X03) | hash://sha256/79e83ed6520d99ddc764f4a0008bc068b5f3b55e14c0b10dbd16b923170f1fb3
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.X02](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.X02) | hash://sha256/72e32f41f47c9496fb6b1f88507f4355eb82dfeb5e8bd60685534848f424ae36
[./PDOX40/biblio(backup%5B2010%5D)/GENUS.DB](./PDOX40/biblio(backup%5B2010%5D)/GENUS.DB) | hash://sha256/97694cb1cca06685e9e6ca5e1558c17009439908942ee5e86db9176cddf32bf1
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.VAL](./PDOX40/biblio(backup%5B2010%5D)/MASTER.VAL) | hash://sha256/521615542bb8b3d2dc6623dd7bb795ebc308c7dc4d25c4e6475fa0f08c9b70d5
[./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.SET](./PDOX40/biblio(backup%5B2010%5D)/JOURNALS.SET) | hash://sha256/2a8797512859d9aa14f61d78c2462b692a817ceb679a8314f671aba362d0e9ce
[./PDOX40/biblio(backup%5B2010%5D)/INIT.SC2](./PDOX40/biblio(backup%5B2010%5D)/INIT.SC2) | hash://sha256/62c2f9b76de31100ab6ba796b5ef7f25783923047108f0bfb317ebf0e4679462
[./PDOX40/biblio(backup%5B2010%5D)/integral.bat](./PDOX40/biblio(backup%5B2010%5D)/integral.bat) | hash://sha256/35b676113906c3d71310b9e2ac086f34c343879110b61ccf858be61d38a2d773
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.VAL](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.VAL) | hash://sha256/63f3094a4173ea3c4bd279db9512daae621c12a601998c78932d16f224b683aa
[./PDOX40/biblio(backup%5B2010%5D)/JOURNREF.R](./PDOX40/biblio(backup%5B2010%5D)/JOURNREF.R) | hash://sha256/7e3ec99a1b222fe393853c3babdcba07ffd1f6c7ff1ad857ce6e3cbce162d09e
[./PDOX40/biblio(backup%5B2010%5D)/MASTER.F8](./PDOX40/biblio(backup%5B2010%5D)/MASTER.F8) | hash://sha256/e6ae85758c21d49cefc8f620e01533123f9611a8265f5667fdc4de53d22a7098
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F8](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.F8) | hash://sha256/b48968f14e1b74d9a0bc05f01e1033ffb39291fec1043ebac980dc0f231a4123
[./PDOX40/biblio(backup%5B2010%5D)/HOSTS.MB](./PDOX40/biblio(backup%5B2010%5D)/HOSTS.MB) | hash://sha256/bd58dea8a527916a27a2327f712866379ab515b5eb3d6f7faf9c4e858e660f2d
[./PDOX40/biblio(backup%5B2010%5D)/REFS.YG0](./PDOX40/biblio(backup%5B2010%5D)/REFS.YG0) | hash://sha256/5bd866bc6fd8f886169828f88a5a58b8acf75a6ae8226be4ad30165c7406632c
[./PDOX40/biblio(backup%5B2010%5D)/SPECIES.YG0](./PDOX40/biblio(backup%5B2010%5D)/SPECIES.YG0) | hash://sha256/b8f8e2d3d892beeb5984e98a4faef5e57a4f245b7fa0b3b91186d1e49c2e9d73
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.F](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.F) | hash://sha256/97be8051e53798ff37e32d04658bf54100f90f8abfab430d6ffcaf27c5486fcd
[./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.F2](./PDOX40/biblio(backup%5B2010%5D)/HOSTOLIN.F2) | hash://sha256/69c4e81c117fd848bad0fee7a6d308270bbb5120485b8e3bcf343879978df7c8
[./PDOX40/biblio(backup%5B2010%5D)/DIST.F3](./PDOX40/biblio(backup%5B2010%5D)/DIST.F3) | hash://sha256/9bc12282f1d02fb715116ebda86864293f51f6e28bef88584267752bbbe38a37
[./PDOX40/biblio(backup%5B2010%5D)/COUNTRY.SET](./PDOX40/biblio(backup%5B2010%5D)/COUNTRY.SET) | hash://sha256/c05f6f99b5edf4363d4e697b689daff3ee81aac018f4b44df200c1f241435283
[./PDOX40/biblio(backup%5B2010%5D)/COLL.SET](./PDOX40/biblio(backup%5B2010%5D)/COLL.SET) | hash://sha256/3047c4b4957a7141de6e13753146ba8b9391f258d05baaeaaa9d78fe7fbd7493
[./PDOX40/biblio(backup%5B2010%5D)/REFS.DB](./PDOX40/biblio(backup%5B2010%5D)/REFS.DB) | hash://sha256/9c778746ac0a17e83c797664d8ce8f394de336b5c0cb5185adc78d193dd32c97
[./PDOX40/biblio(backup%5B2010%5D)/REFEXT.F1](./PDOX40/biblio(backup%5B2010%5D)/REFEXT.F1) | hash://sha256/e687364162bdc355c9a557481af5e82210719ce4a674cf1dce6b44ffd8f19055
[./PDOX40/DESKJET.PDF](./PDOX40/DESKJET.PDF) | hash://sha256/d5106829127c7d0b56cbc16d06cbbb59dcf7f237a09563fdfd3b03bd8b5344cc
[./PDOX40/CFG.BAT](./PDOX40/CFG.BAT) | hash://sha256/d43e5827364ada30825467ca10e244ea2cd5a912b1412e95a1ee591169a145ba
[./PDOX40/REGISTER.BAT](./PDOX40/REGISTER.BAT) | hash://sha256/5cc00ebefde2f1d19ec045cc6ad36419d34183dc58e7c948a299d18d727b3f17
[./PDOX40/PATCH.COM](./PDOX40/PATCH.COM) | hash://sha256/5d60d095b644abd40e1d461f04876ad97b8baaf38d8798fa8491e26c211b04f8
[./PDOX40/LITT.CHR](./PDOX40/LITT.CHR) | hash://sha256/8a6ecee3378830669335c07c661dc8929c25b01a7163b7fdb32d634d074d6b9c
[./PDOX40/TUTILITY.DOC](./PDOX40/TUTILITY.DOC) | hash://sha256/f297b7d3de801623fe49eab7dff9741f6ca8c11a30e338d4a0ee3a35d48188da
[./PDOX40/T1000.BGI](./PDOX40/T1000.BGI) | hash://sha256/3f6fab3478eb79a5dbc7409e99055e71d2efdc905b8a0145e1b81ac43f3a088a
[./PDOX40/PDOXLAND.PS](./PDOX40/PDOXLAND.PS) | hash://sha256/4c9c08f71e055b570d61df06db406a3212d18a6f16abdc9cdc7b021ca8975fec
[./PDOX40/$PALMEM$](./PDOX40/$PALMEM$) | hash://sha256/0f4ef8539a16209f798ca90dd9b86b4eeea348440dd9297e6e28327809cdee7c
[./PDOX40/IBMPCLAN](./PDOX40/IBMPCLAN) | hash://sha256/d430ca38a4e990dced33166c915d05934ccf0f81dc03607d4c2b1a42355ab635
[./PDOX40/TUTILITY.EXE](./PDOX40/TUTILITY.EXE) | hash://sha256/748940eb346cfbecb7520d5978518c8e2b3afd72fb317e8343ce9463a7dcda1d
[./PDOX40/PARADOX.SOR](./PDOX40/PARADOX.SOR) | hash://sha256/fa07b313be60346494d7b58d72e567e9a3ebbf77d3f904437e1c4a14e4a0a671
[./PDOX40/biblio/H-FAM.F](./PDOX40/biblio/H-FAM.F) | hash://sha256/6032945aff6f2a22fd51b094a1140699874d12445926939924ec716510d56b8e
[./PDOX40/biblio/GENUS.F1](./PDOX40/biblio/GENUS.F1) | hash://sha256/6806b5f6b35dcda849764722a5d4360e326fa33eb88e9a5ae119415fae2edeca
[./PDOX40/biblio/MASTER.PX](./PDOX40/biblio/MASTER.PX) | hash://sha256/4f9bb12d2332f82f6c580e813bcbfaef1431853c7676f6941a3a8bea8d862f93
[./PDOX40/biblio/REFS.F1](./PDOX40/biblio/REFS.F1) | hash://sha256/de8175b074f9a4a659d7151e45a930ea16afeaf423c253c096ffee79c92b6640
[./PDOX40/biblio/H-FAM.SET](./PDOX40/biblio/H-FAM.SET) | hash://sha256/8a0bae40ac93c2e5a6e0fce9ff06edbd1baa056c0220ccdbaacee36dc9167c4b
[./PDOX40/biblio/RELIABLE.F](./PDOX40/biblio/RELIABLE.F) | hash://sha256/63b024acb8aee86244d27083cea7d0795d34ae53020cf1f9d856d64d5c9332a4
[./PDOX40/biblio/HOSTS.X13](./PDOX40/biblio/HOSTS.X13) | hash://sha256/921ddfd969c455997c8c2a74f81ed616fb2c12f033d921655babe831d8c72ea2
[./PDOX40/biblio/HOSTOLIN.MB](./PDOX40/biblio/HOSTOLIN.MB) | hash://sha256/640b5e361093af95e9f50c1f1cff03a5424e09cdf51ddfc3b50d08f6c4d1cc36
[./PDOX40/biblio/KEYWORDS.DB](./PDOX40/biblio/KEYWORDS.DB) | hash://sha256/129f848d1abb64f3ccea7040722187767bc78d0cb65deef51d94d1fbb7546311
[./PDOX40/biblio/SPECIES.PX](./PDOX40/biblio/SPECIES.PX) | hash://sha256/d79c64fe416929806c726ce07b83f820f96d730f5ab8436fdced0888df61d0b0
[./PDOX40/biblio/GENUS.PX](./PDOX40/biblio/GENUS.PX) | hash://sha256/714dcb76874919868426af7a6fe00e4557d707b262d9ce5f438170609eb09d32
[./PDOX40/biblio/MASTER.F5](./PDOX40/biblio/MASTER.F5) | hash://sha256/770c06fd8941856b05ee563b509ceb7e120ae4f64d9ff139076a002aa310bae7
[./PDOX40/biblio/REFS.DBF](./PDOX40/biblio/REFS.DBF) | hash://sha256/39d80f433113710de71e1c1defa6484b72a8c0611831f32e77235cb2bdceaea2
[./PDOX40/biblio/WWWIMAOK.X05](./PDOX40/biblio/WWWIMAOK.X05) | hash://sha256/e42c0f54746ade68cb342a206a2122dce7b2c31d732e8b59fa0de8ea8f8ed26b
[./PDOX40/biblio/DISTOLIN.DB](./PDOX40/biblio/DISTOLIN.DB) | hash://sha256/c462bf2d9b489830f5f9b01458af6d6e1e7815f4bd3730399a16ea837f87ed64
[./PDOX40/biblio/STATUS.DB](./PDOX40/biblio/STATUS.DB) | hash://sha256/f22693ad978644eba882e2e815e2ca898837a908082f6ea7bbfa57b1a8dda413
[./PDOX40/biblio/SPECIES.F9](./PDOX40/biblio/SPECIES.F9) | hash://sha256/26167ea0d58f43c3ad30184768891077aa8b47a689251cae3b56c03c19fd47fb
[./PDOX40/biblio/FGNAMES.DB](./PDOX40/biblio/FGNAMES.DB) | hash://sha256/eed4357f12bf6ae7a3cbea31cb35d8eca910eb187b251e4d2706d23e965a72d7
[./PDOX40/biblio/GENUS.MB](./PDOX40/biblio/GENUS.MB) | hash://sha256/692b04ddc9fb22fab75e3dca018173ccc34f2e746e97c894355ac88f6f820696
[./PDOX40/biblio/SPECIES.VAL](./PDOX40/biblio/SPECIES.VAL) | hash://sha256/529a4feeeaa5e024aeaa1496ca2267342bcc0aea7eb982e6e6b9fde1d132f362
[./PDOX40/biblio/RELIABLE.DB](./PDOX40/biblio/RELIABLE.DB) | hash://sha256/4e84cb86ed7c4b2224d1ecc8b3a37f6968949beb50a124ce8aadb50978f5906b
[./PDOX40/biblio/RELATION.DB](./PDOX40/biblio/RELATION.DB) | hash://sha256/a0666de7cb759d920b0c5d638bb22c0f95b8ba5149cd7ae0ae467183d55f4fdb
[./PDOX40/biblio/GENUS.VAL](./PDOX40/biblio/GENUS.VAL) | hash://sha256/2a095bee27bb3a26d3a24ef76c80fbb486baa162a1856481d09508bcc82421c9
[./PDOX40/biblio/TRAN.DB](./PDOX40/biblio/TRAN.DB) | hash://sha256/b13f40e6f297bdc870c6acf871847ed901bc6e96b28080cb2d341c21d7d39349
[./PDOX40/biblio/DIST.MB](./PDOX40/biblio/DIST.MB) | hash://sha256/36a9f8b07123a49b7de5c1101e43e27eb0d2afa4d3c89be4e0a6403a1338a7f6
[./PDOX40/biblio/HOSTFAM.Y05](./PDOX40/biblio/HOSTFAM.Y05) | hash://sha256/69db38fd29e13d7368bc87aefb5680927dff5ef5f99aad2bfbfd5421d6cc59a9
[./PDOX40/biblio/MASTER.YG2](./PDOX40/biblio/MASTER.YG2) | hash://sha256/f9483637854174510cd930890bf7ec8d1660e2c44a75902a948aee3747d0cd8e
[./PDOX40/biblio/HKNEW.MB](./PDOX40/biblio/HKNEW.MB) | hash://sha256/55b5a115e76ef6df3813069c13e01d40db792e2da696d2bba54cf5d1e4a65f50
[./PDOX40/biblio/HKOLIN.F](./PDOX40/biblio/HKOLIN.F) | hash://sha256/c817febc46ed1dae83f376b828fbad31bf5f84f4e7718c316486ede82be41840
[./PDOX40/biblio/HOSTS.YG1](./PDOX40/biblio/HOSTS.YG1) | hash://sha256/5d6a178a127723df6afc1b050f27829e703b9c9c6a09731090f63a98d0802e9d
[./PDOX40/biblio/DISTOLIN.F](./PDOX40/biblio/DISTOLIN.F) | hash://sha256/570b190b9fdaa2b4356e935646d9598adbee6e332a59a6e2577d466405cf3606
[./PDOX40/biblio/WWWIMAOK.DB](./PDOX40/biblio/WWWIMAOK.DB) | hash://sha256/c1dbc731c3555989a839542d493072ca141e9f125ff05acf8281067c79616a43
[./PDOX40/biblio/HOSTOLIN.SET](./PDOX40/biblio/HOSTOLIN.SET) | hash://sha256/343e04817871bc035bd505719fb7dda5e0b6311b66b657068db617d44ed33918
[./PDOX40/biblio/REFLOOK.SC](./PDOX40/biblio/REFLOOK.SC) | hash://sha256/f66a0c1593dfc7d360f566b91db4c4b32c9c63715635190bc26623ba5625bdd6
[./PDOX40/biblio/HOSTOLIN.DB](./PDOX40/biblio/HOSTOLIN.DB) | hash://sha256/815c7ccf7e244ba661dd0d5d816ff60e2ec5f9daaf6d234ca66199d4066d31b6
[./PDOX40/biblio/HOSTS.X02](./PDOX40/biblio/HOSTS.X02) | hash://sha256/0dab2529f1f5869679e48b5c709262a0f7cb046ce90811c9cb339357baa971b1
[./PDOX40/biblio/HOSTFAM.SET](./PDOX40/biblio/HOSTFAM.SET) | hash://sha256/5f7bdc005f5490903238a5309c7902655fdfbb13e9e5f86bb2aee414695ac281
[./PDOX40/biblio/REFS.Y15](./PDOX40/biblio/REFS.Y15) | hash://sha256/aaf8600128a380379aed578e10b90c7570ea97e122b0637eaf65f688e1ae16db
[./PDOX40/biblio/SPECIES.XG0](./PDOX40/biblio/SPECIES.XG0) | hash://sha256/36076cda0cc114ba0b9f37897f571e1e3e531b95c34d4ec0b53e0c8ba2cd7e10
[./PDOX40/biblio/MASTER.X0A](./PDOX40/biblio/MASTER.X0A) | hash://sha256/5ca5d2787f7dfc1402d3ecd7ae8d93e7e4d77f940a584807348008d5a4110b4b
[./PDOX40/biblio/HKOLIN.DB](./PDOX40/biblio/HKOLIN.DB) | hash://sha256/0510f941a392ac693d0394f1de8bc0b6d0a2cb7413d1b7d8dc34ebdd8947ce6b
[./PDOX40/biblio/WWWIMAOK.Y05](./PDOX40/biblio/WWWIMAOK.Y05) | hash://sha256/a37febdd2603a6e35cc2f9866b24fcc77c2185c25091904cb83280d6e4bdf4d9
[./PDOX40/biblio/HOSTFAM.X05](./PDOX40/biblio/HOSTFAM.X05) | hash://sha256/66eba596423da595c09d4e9780f95d11b923c8aa98e247d13e15eeeeb0b92c4c
[./PDOX40/biblio/REFEXT.F](./PDOX40/biblio/REFEXT.F) | hash://sha256/39e8c12457a26e77e109ef1974bc2a81fad1603aadd5d12406d45c3526a722dd
[./PDOX40/biblio/GENUS.F7](./PDOX40/biblio/GENUS.F7) | hash://sha256/5de5774b45ba35185d11c6d85fd570caa313f92f23af304bdf4c019ddd6b1a32
[./PDOX40/biblio/COLL.F](./PDOX40/biblio/COLL.F) | hash://sha256/060e103fabddcc33558f43bfc0632b14dd0fc8654e5707bb357da5f2931fba74
[./PDOX40/biblio/HOSTFAM.PX](./PDOX40/biblio/HOSTFAM.PX) | hash://sha256/86c4d84e1adae5f24d4ef952c72f54e556cb383e752792595282ae078cd34b7e
[./PDOX40/biblio/REFEXT.DB](./PDOX40/biblio/REFEXT.DB) | hash://sha256/0197378fab72ef21bee7eff89c924b6aeb52396d6f026921989201d78b1765e3
[./PDOX40/biblio/SPECIES.F5](./PDOX40/biblio/SPECIES.F5) | hash://sha256/32fd16420b8df58018c51c96ab2e92db62393ffaf47d59d40693250634fa657f
[./PDOX40/biblio/TSTAT.F](./PDOX40/biblio/TSTAT.F) | hash://sha256/1804536bd09cda8e471eae0da1e4c86071a7075b18df38c11d344afec25602fe
[./PDOX40/biblio/P-TYPE.DB](./PDOX40/biblio/P-TYPE.DB) | hash://sha256/34c4be2b1ec2959a3b945755f46b5605633b068362d35cbb69305ca566407b79
[./PDOX40/biblio/SPECIES.F2](./PDOX40/biblio/SPECIES.F2) | hash://sha256/c0fbd64c11470950349499bd7573cf8f04e6be1da4b66c35937f05c37043eb19
[./PDOX40/biblio/KEYWORDS.SET](./PDOX40/biblio/KEYWORDS.SET) | hash://sha256/e4272214a3661764649cc20afbfea2ef99163955c16f9e279c534c199cb7d0ea
[./PDOX40/biblio/DISTOLIN.F1](./PDOX40/biblio/DISTOLIN.F1) | hash://sha256/e959d36197ea243c12674e7efb0093231a7ccb1f99744c503ae6995873b142ef
[./PDOX40/biblio/INIT.SC](./PDOX40/biblio/INIT.SC) | hash://sha256/359c2037855c0ea247e12eb5432b7ac27d8cb3928e44472828362c34119198e9
[./PDOX40/biblio/SPECIES.DB](./PDOX40/biblio/SPECIES.DB) | hash://sha256/eed0037c099b1ec3585a703692f0cc076956d5cd63cf9f7bcd221c5b3e48d7f4
[./PDOX40/biblio/MASTER.SET](./PDOX40/biblio/MASTER.SET) | hash://sha256/4ed934bdef405ee41383f22c8bdf37e3df73a5b04e8c00aee51ba54baadaaaf4
[./PDOX40/biblio/FGNAMES.SET](./PDOX40/biblio/FGNAMES.SET) | hash://sha256/dd6974f9dea2bd469f257b8fe2d102e5e980441f6063afdf5a892428aff97e4f
[./PDOX40/biblio/HOSTOLIN.Y0B](./PDOX40/biblio/HOSTOLIN.Y0B) | hash://sha256/ebd012444ca4934a65dbe91553701d54d97df35df930dce94ad542ef8f2e00ae
[./PDOX40/biblio/MASTER.XG2](./PDOX40/biblio/MASTER.XG2) | hash://sha256/ada69c0f1a66e9804bee279866640ef73d74b4cc3ea455801f80a6a5b9b4f183
[./PDOX40/biblio/DISTOLIN.PX](./PDOX40/biblio/DISTOLIN.PX) | hash://sha256/0720dbb8a85b599d174f3d7d8bc1ea9d217308c0ff3588dbe387c7609639be08
[./PDOX40/biblio/FAMTRIB.MB](./PDOX40/biblio/FAMTRIB.MB) | hash://sha256/0465d0fb38e16037014d911c307eda443bed685b27708346b0334e4a7686296b
[./PDOX40/biblio/KEYWORDS.F](./PDOX40/biblio/KEYWORDS.F) | hash://sha256/9267746a05ce6c1513e582abe99e51194bc57d6aa3fdc4160d8f334387a7bd76
[./PDOX40/biblio/HOSTS.PX](./PDOX40/biblio/HOSTS.PX) | hash://sha256/64cc2544d64e353fcad81840be255c1f88e38e99e568d964ce41d4afeee66958
[./PDOX40/biblio/HOSTOLIN.Y02](./PDOX40/biblio/HOSTOLIN.Y02) | hash://sha256/fadbf6bed9f5aa27403b81c6469edae320b46a257fe80a791a6def3a3167027d
[./PDOX40/biblio/HOSTOLIN.X03](./PDOX40/biblio/HOSTOLIN.X03) | hash://sha256/28995a99b377663d955ba6c9f52ff8476c87052608bfa1238bd0778140d4f56a
[./PDOX40/biblio/HKNEW.PX](./PDOX40/biblio/HKNEW.PX) | hash://sha256/331375b3fc6500b3034cd281bc5be0ad21c5859fc2b4ba9b2dbed65ed8bf79e2
[./PDOX40/biblio/MASTER.F2](./PDOX40/biblio/MASTER.F2) | hash://sha256/a12e96bf67df1b595e299b6e38cfb2a2a3b6be4a66ec354001217c4a2036f3f2
[./PDOX40/biblio/TSTAT.VAL](./PDOX40/biblio/TSTAT.VAL) | hash://sha256/9840eff7912645724b66ffcdce90c90833a6ab43921aab37eaea748049c47076
[./PDOX40/biblio/REFS.VAL](./PDOX40/biblio/REFS.VAL) | hash://sha256/23bdb74a0424fd2964c0d443a88f99546509c562e7e2034e471c9e1ad183c8d9
[./PDOX40/biblio/MASTER.F4](./PDOX40/biblio/MASTER.F4) | hash://sha256/39447b01dfd80889c02b96678ae236adfc6bb0cc9ad8e898069c940614b9d766
[./PDOX40/biblio/HOSTS.F](./PDOX40/biblio/HOSTS.F) | hash://sha256/483e7dc575fc6abade5bcc21743acacd9e07171ed295bb9f1cabf6fd3393ec8c
[./PDOX40/biblio/DISTOLIN.F2](./PDOX40/biblio/DISTOLIN.F2) | hash://sha256/28cb7c6b743b2034e580168bdc8fd267e5f2fe36c022d11c8c59cb8ea3f0b4d5
[./PDOX40/biblio/WWWIMAOK.F](./PDOX40/biblio/WWWIMAOK.F) | hash://sha256/0e598df51cc8ada60166d7c62078abc11973dcec993f3c94e0b58f8d6d527c3f
[./PDOX40/biblio/COUNTRY.F](./PDOX40/biblio/COUNTRY.F) | hash://sha256/65f7f29bd66b1a285cb2adcd2c1ebd81a7f4e92578330f8b374e5ba3c457ec7d
[./PDOX40/biblio/REFS.SET](./PDOX40/biblio/REFS.SET) | hash://sha256/548c10b4aa391d78a6674ac6966f635e595b7f43882b967c41deddeccc578f66
[./PDOX40/biblio/MASTER.F3](./PDOX40/biblio/MASTER.F3) | hash://sha256/a9a4be94211eb08b93822c3c3ef5d5b21cfa402726127c61dc86b496b9a5846e
[./PDOX40/biblio/DIST.DB](./PDOX40/biblio/DIST.DB) | hash://sha256/7df461592e999c79451cc66e16378622c8e749e9ea8c2abe81922d07c3d9b8ee
[./PDOX40/biblio/FAMTRIB.VAL](./PDOX40/biblio/FAMTRIB.VAL) | hash://sha256/35301ce861f183e8003e745d5c0a84e7785a25b72e7524b3720ad80f3fda75f2
[./PDOX40/biblio/REFS.R](./PDOX40/biblio/REFS.R) | hash://sha256/3dda1ecd5edaed7fd459e76c31b0eee6a058c9ca3ee3dc264c7b9a3871f446ed
[./PDOX40/biblio/FGNAMES.PX](./PDOX40/biblio/FGNAMES.PX) | hash://sha256/d6e72696e8aa212a794997ed30f6b731a6c14aab92ae8407dd2026a37228a30f
[./PDOX40/biblio/SPECIES.F4](./PDOX40/biblio/SPECIES.F4) | hash://sha256/2ee0138e63adc47272a4f5888b6439250412d994496e07e73ed11d68e56bfeaf
[./PDOX40/biblio/REFS.XG0](./PDOX40/biblio/REFS.XG0) | hash://sha256/4b15dc88c49e41e69b56523f4fc1d6e3bd64eba701fd08e866216f36d940c576
[./PDOX40/biblio/COUNTRY.DB](./PDOX40/biblio/COUNTRY.DB) | hash://sha256/0710b5cf66ab2275987c65b0da21360a5f60fe111cd442ad27d8b917533dce0c
[./PDOX40/biblio/LANGUAGE.DB](./PDOX40/biblio/LANGUAGE.DB) | hash://sha256/860bdcac437efa1f579052638968931b3a57ed9b3717bee2a1c9fdede56cb7a4
[./PDOX40/biblio/DISTOLIN.VAL](./PDOX40/biblio/DISTOLIN.VAL) | hash://sha256/0392ba36544c53f46ce34be7de87536e8634fa933d714917ecceaeee6830ab9e
[./PDOX40/biblio/FAMNAMES.DB](./PDOX40/biblio/FAMNAMES.DB) | hash://sha256/ed463207afd58b5203b39ac720498afc70a0aaafa20a9c359d62ae70fec272e8
[./PDOX40/biblio/DIST.VAL](./PDOX40/biblio/DIST.VAL) | hash://sha256/236f975407161a72ac9984ad0c9c2705c17322e8edacc5b3e8dad407e82c0033
[./PDOX40/biblio/SPECIES.F](./PDOX40/biblio/SPECIES.F) | hash://sha256/26b14f209137e7412d486b2f9981de1e3ea36ee00fad8a42fede4ee6480c96cb
[./PDOX40/biblio/REFS.F2](./PDOX40/biblio/REFS.F2) | hash://sha256/4ce637d6829cfb40c30a189c95d9c0ddc8681efeaf256ed1e0c52e4e8f307275
[./PDOX40/biblio/HOSTS.XG1](./PDOX40/biblio/HOSTS.XG1) | hash://sha256/066479134d85a63315410abde787f5e49d5dcdbd96b1c8d50a01fa77eb6333e2
[./PDOX40/biblio/SPECIES.F7](./PDOX40/biblio/SPECIES.F7) | hash://sha256/5afdb94b296e6ad5c2c4be335b4de7c304b973688d8edaf40b2e349b575baccb
[./PDOX40/biblio/HOSTS.F2](./PDOX40/biblio/HOSTS.F2) | hash://sha256/18f20394dbbd14a16902c83c572902ca2ca6cd22d7e3bf1a9bbc9ba595da8e3d
[./PDOX40/biblio/HOSTOLIN.Y03](./PDOX40/biblio/HOSTOLIN.Y03) | hash://sha256/37f7e9c1a84a39394a88ccfa46ebca7824b730d055964b29780b920fcc845c65
[./PDOX40/biblio/SPECIES.X10](./PDOX40/biblio/SPECIES.X10) | hash://sha256/bf5b422b3ea4c726bdca4493cd6fb2c27eef0448cb9536f615e6a4f94980e0d3
[./PDOX40/biblio/REFS.PX](./PDOX40/biblio/REFS.PX) | hash://sha256/4a26ee3c70d5460422c83c623cebf68c533f16ca5ba7b354ab0420f0b6015866
[./PDOX40/biblio/GENUS.F](./PDOX40/biblio/GENUS.F) | hash://sha256/b5acea3a20150b9c29472b630fd11daf4cefda9f190d2df4d97278046f03d129
[./PDOX40/biblio/HOSTOLIN.VAL](./PDOX40/biblio/HOSTOLIN.VAL) | hash://sha256/a4dc77986c6573f654b82f098908968328714546ef52cb7e82c22d6837d3897f
[./PDOX40/biblio/SPECIES.F6](./PDOX40/biblio/SPECIES.F6) | hash://sha256/22ad9d3a54b2030ce95497972c3e8c835edcb0bb2098d99da3f43e7e4ecb2b8c
[./PDOX40/biblio/WWWIMAOK.X02](./PDOX40/biblio/WWWIMAOK.X02) | hash://sha256/e923a0fb43c89b27e5e24b78492ad365dbcb7dbc77209a4257b0e30452101012
[./PDOX40/biblio/MASTER.F6](./PDOX40/biblio/MASTER.F6) | hash://sha256/40a74a01fcd0f470c050c0e32ee933740bd6a741575aeae090a0251695245cd2
[./PDOX40/biblio/SPECIES.F1](./PDOX40/biblio/SPECIES.F1) | hash://sha256/d5bf7acc6c554d9d0712121185110904081f6e5efdb28506066235d4f0970cd4
[./PDOX40/biblio/PROTREC.SC](./PDOX40/biblio/PROTREC.SC) | hash://sha256/733e477ba696287aae1734508e3d86d83eab1d657b7c46857d7cc62a30e5a407
[./PDOX40/biblio/HKOLIN.MB](./PDOX40/biblio/HKOLIN.MB) | hash://sha256/d6dfaae93fac8033a574802d0f3f60fbe135469adafc62cbcef3245a1d004476
[./PDOX40/biblio/DIST.F](./PDOX40/biblio/DIST.F) | hash://sha256/63917b89a37eab4b72e91df9743f30489801ad0797122844860c7c7bdd27d9f3
[./PDOX40/biblio/P-TYPE.PX](./PDOX40/biblio/P-TYPE.PX) | hash://sha256/b11ff020b8a81ee733827d1ffde642ddbe89d1aa2a6c41218f2e33d3c0b336f8
[./PDOX40/biblio/RELATION.PX](./PDOX40/biblio/RELATION.PX) | hash://sha256/9834d8a0e5cd3ebb8038e8d281c0b1751b948307e13b281a198f6946400e0bdc
[./PDOX40/biblio/GENUS.F2](./PDOX40/biblio/GENUS.F2) | hash://sha256/6806b5f6b35dcda849764722a5d4360e326fa33eb88e9a5ae119415fae2edeca
[./PDOX40/biblio/DISTOLIN.MB](./PDOX40/biblio/DISTOLIN.MB) | hash://sha256/c5209a66181f49233eb0937a6cc6502dcbb3e6c80860bbecc46c0c63610dcc91
[./PDOX40/biblio/RELIABLE.R](./PDOX40/biblio/RELIABLE.R) | hash://sha256/d67a407c2ce21c53d42fb0da6eaa3a40f8be115054d5fbb8b96b8d3148922188
[./PDOX40/biblio/FAMTRIB.F](./PDOX40/biblio/FAMTRIB.F) | hash://sha256/96490ade808bbfdb044c74e132c9d40815e3e96b0bc245653198068022780138
[./PDOX40/biblio/FAMTRIB.PX](./PDOX40/biblio/FAMTRIB.PX) | hash://sha256/c0d43ae3a602988165bceedc93ae5dcce3fe1c359ea46cc72b34a36497ee2c58
[./PDOX40/biblio/MASTER.F](./PDOX40/biblio/MASTER.F) | hash://sha256/cd5f9f080461511e2ef18d64f2ce6c051b944fcc546a30d915dac0b552ced657
[./PDOX40/biblio/NEWHOST.DB](./PDOX40/biblio/NEWHOST.DB) | hash://sha256/72d68219bc36e2240754356b89ae6ea15f04bf2cf37193dea88a24def74a4157
[./PDOX40/biblio/HOSTFAM.F](./PDOX40/biblio/HOSTFAM.F) | hash://sha256/c38cb7f4670561f3944fa4bf78e85efd5cc8f4a78500e7dabba7f00935182504
[./PDOX40/biblio/TSTAT.F1](./PDOX40/biblio/TSTAT.F1) | hash://sha256/7548413f02949bce83e09730f894be354703c95a202a1d75b293597d72515743
[./PDOX40/biblio/FAMNAMES.PX](./PDOX40/biblio/FAMNAMES.PX) | hash://sha256/104ed460e7d19e9c6fd926be097c4970b6a25e49174ce16e391347a9ebcf411f
[./PDOX40/biblio/HKNEW.DB](./PDOX40/biblio/HKNEW.DB) | hash://sha256/5b138e15ac3404d19f8b8e10208b84a647bdb4ec2885dcb454de1cc716b32291
[./PDOX40/biblio/TSTAT.DB](./PDOX40/biblio/TSTAT.DB) | hash://sha256/d17ca48ac2255fc1bb9455d3b81523f64c3ff36895ce858f4d64f688965a71d4
[./PDOX40/biblio/HOSTS.Y02](./PDOX40/biblio/HOSTS.Y02) | hash://sha256/b217810823b5ae092a7a068dbfe9c3cb7b1ef6fda0067be6771fe6a07cc1a2ad
[./PDOX40/biblio/HKOLIN.Y03](./PDOX40/biblio/HKOLIN.Y03) | hash://sha256/4ddab986aba2d870b8c2905642d14ab78e343959cf45d63854abab932d6e4c11
[./PDOX40/biblio/WWWIMAOK.R](./PDOX40/biblio/WWWIMAOK.R) | hash://sha256/5cf0d8d54f3e4d90dc3f492bf933ff65b22a7f8c7bcea841f81db2883f29a37b
[./PDOX40/biblio/H-FAM.DB](./PDOX40/biblio/H-FAM.DB) | hash://sha256/16ba3c50820dba993371532a480380df92ea052f717e5c24c4da49e466c34186
[./PDOX40/biblio/SPECIES.F3](./PDOX40/biblio/SPECIES.F3) | hash://sha256/9c57b4d0d02d384f299befdb07dd4e4d6f27af10fb981a600d8d8a47045177c4
[./PDOX40/biblio/MASTER.DB](./PDOX40/biblio/MASTER.DB) | hash://sha256/606038b22fa7de9c86daf055729f4af244363c28fd40c891d1e575420908c587
[./PDOX40/biblio/WWWIMAOK.Y02](./PDOX40/biblio/WWWIMAOK.Y02) | hash://sha256/d7904952a3602a6e6386b09d22614d6e94a20543691f183225738b5e6cf66794
[./PDOX40/biblio/HKOLIN.PX](./PDOX40/biblio/HKOLIN.PX) | hash://sha256/c07747fd26a09da1d9a200cbc63dbc744b8f9cdd088a74380270ebc9cda3cafc
[./PDOX40/biblio/MASTER.XG0](./PDOX40/biblio/MASTER.XG0) | hash://sha256/95e877ae78898742db506ef984b2da1f79ec4769be53df3c821fd19b58907b89
[./PDOX40/biblio/HOSTS.YG0](./PDOX40/biblio/HOSTS.YG0) | hash://sha256/f76f60699e2c2fda4ad6ef3331a3004711d896c46478a6ac0304c15b5b8d31ed
[./PDOX40/biblio/HOSTFAM.F1](./PDOX40/biblio/HOSTFAM.F1) | hash://sha256/508516cde9483eaf713ccdcd81d50fbfd701f581470198583cc6edbfe83462fd
[./PDOX40/biblio/HOSPLANT.DB](./PDOX40/biblio/HOSPLANT.DB) | hash://sha256/defda8f191c8f8ced6a8386b5eee69ff30d5c00e43df889e97798601e373cf62
[./PDOX40/biblio/HOSTFAM.DB](./PDOX40/biblio/HOSTFAM.DB) | hash://sha256/6b18c7b36a691506df8b117e87f1c98c8a1b9f2741536310c0ba86e79d885076
[./PDOX40/biblio/DIST.YG0](./PDOX40/biblio/DIST.YG0) | hash://sha256/905c5c71efd4d38e72be9d7cccd9763d82fdc5b75a2fc77fbc85d03d4a67afb2
[./PDOX40/biblio/SPECIES.F10](./PDOX40/biblio/SPECIES.F10) | hash://sha256/4c8c2bcbc64c4fbadd5c445b7eba27a23237423f87491d7a7e0738feb8474dba
[./PDOX40/biblio/WWWIMAOK.PX](./PDOX40/biblio/WWWIMAOK.PX) | hash://sha256/b1c8404477503c6f529256ae4a7690286c32ee29a803c028a047b081c9a01cc9
[./PDOX40/biblio/DISTOLIN.F3](./PDOX40/biblio/DISTOLIN.F3) | hash://sha256/ffe17d7cc091d083b499a970d2f656675a0993a6e2c974087f4b8e5cc75b2120
[./PDOX40/biblio/STATUS.SET](./PDOX40/biblio/STATUS.SET) | hash://sha256/66b26c5f7dfdc3f786a61cb98fcfead162fc730dee4d12c382820abc73cb1af4
[./PDOX40/biblio/STATUS.PX](./PDOX40/biblio/STATUS.PX) | hash://sha256/f571ba5fe57fcc0ab2501d47322cbc90ec8bfc18749d7ff8ca732b3adfd45fa1
[./PDOX40/biblio/P-TYPE.RPT](./PDOX40/biblio/P-TYPE.RPT) | hash://sha256/92bee9f076039417306c54b596c6efa496a73e8f967c9caa3f74ce379dd969f8
[./PDOX40/biblio/KEYWORDS.R](./PDOX40/biblio/KEYWORDS.R) | hash://sha256/3e81a2952432f50e2ff6664c225d86df0fa9669d1ce1d3b9e3c847fee84683a9
[./PDOX40/biblio/HOSTOLIN.X0B](./PDOX40/biblio/HOSTOLIN.X0B) | hash://sha256/28427208e32404832605f5d49db067d9e98b739f7b4a3d735f1c11223b0b7da1
[./PDOX40/biblio/HOSTS.XG0](./PDOX40/biblio/HOSTS.XG0) | hash://sha256/a7ad7332c9c584e61b26b2633edd42707d116b0aa7be81f0ac50c7e856df35ce
[./PDOX40/biblio/COLL.DB](./PDOX40/biblio/COLL.DB) | hash://sha256/0a09ccb55e9fb6c9c93c298055bf9c983a3d0b847d9f23719d85f7fe8424720a
[./PDOX40/biblio/WWWIMAOK.R1](./PDOX40/biblio/WWWIMAOK.R1) | hash://sha256/4b800bd413bd9e13479b54e7fb40e2c4f4e23db1f15f9315384e4a294aa72b83
[./PDOX40/biblio/TSTAT.PX](./PDOX40/biblio/TSTAT.PX) | hash://sha256/dab44e4e680d2f7ca9eb5426df80e89f1294632c67e2ac8f2af956b20f8a723a
[./PDOX40/biblio/SPECIES.Y10](./PDOX40/biblio/SPECIES.Y10) | hash://sha256/9af3c7b8bb99e7ef7c8cbaf4a44ead3d9ffea32a5947894421fa246263b15014
[./PDOX40/biblio/REFS.F](./PDOX40/biblio/REFS.F) | hash://sha256/b463f60f738501c58b61db5658fe207c343b59007d05002be1fca10975241b21
[./PDOX40/biblio/DIST.F1](./PDOX40/biblio/DIST.F1) | hash://sha256/d927f685f6ced3a0162d646f7925dfd74e26708aca9d20bf1cd79157efd3dc45
[./PDOX40/biblio/DISTOLIN.F4](./PDOX40/biblio/DISTOLIN.F4) | hash://sha256/74c28afc0e0e9eef0118adcd712c733cb4aeb9398110aa16debb7f1f01d19a49
[./PDOX40/biblio/FGNAMES.F](./PDOX40/biblio/FGNAMES.F) | hash://sha256/9ba3a74febb030d33b0ee24354930c6dba2bafb7a568bf4e49c10796cb82c07f
[./PDOX40/biblio/DIST.XG0](./PDOX40/biblio/DIST.XG0) | hash://sha256/b38818c393b91c5f51ae1da0dd1db6a110ae766aaaebe1d09c554acb9c00f181
[./PDOX40/biblio/HKNEW.VAL](./PDOX40/biblio/HKNEW.VAL) | hash://sha256/b89cfab4c4a1e2328c647d6f0317092c5a2b7088ed8f25e393c865e4e2787019
[./PDOX40/biblio/FAMTRIB.DB](./PDOX40/biblio/FAMTRIB.DB) | hash://sha256/fe47801b532532b7bb4b78379aa5cfe17ced52b56bfba2ee729680e8a87cfd76
[./PDOX40/biblio/DIST.F2](./PDOX40/biblio/DIST.F2) | hash://sha256/c2f0ace0e79dbe60a6f4f59fa3eb0b1bc5212067d1f2e170f99a7613627a3f48
[./PDOX40/biblio/MASTER.F1](./PDOX40/biblio/MASTER.F1) | hash://sha256/8b628ba59045939740412e6dbc150d0f6538598d2a88b689c86f947dc1ed1be3
[./PDOX40/biblio/DIST.PX](./PDOX40/biblio/DIST.PX) | hash://sha256/2e2d4bd802cda36da3f1466de7270d9c9ae86a62523fa8a11d46ca4ab30d40a2
[./PDOX40/biblio/HOSTS.DB](./PDOX40/biblio/HOSTS.DB) | hash://sha256/0bfff491a03a0c27fbd020d5b812a06482c5d5d2ad22f0f4cf9c5fe1f31c6266
[./PDOX40/biblio/SPECIES.MB](./PDOX40/biblio/SPECIES.MB) | hash://sha256/3a3806a3be3e20b666418743d060d00e3decc34b7e44d0946df3617d05fbdb51
[./PDOX40/biblio/HOSTS.F3](./PDOX40/biblio/HOSTS.F3) | hash://sha256/72712aa900d1dfacc7c2dbd1edb21f6b9c62351c235a77567e1413ad4cc3021c
[./PDOX40/biblio/HKNEW.F](./PDOX40/biblio/HKNEW.F) | hash://sha256/5497e95ac808be678d23ad09d9fe102ec112abba5664484a99c1e73e45a16954
[./PDOX40/biblio/MASTER.YG0](./PDOX40/biblio/MASTER.YG0) | hash://sha256/61bb2d68cdb6108791bfdb4115c6353837b19b01e218ceb5b4321126dc1c06a2
[./PDOX40/biblio/TSTAT.MB](./PDOX40/biblio/TSTAT.MB) | hash://sha256/01080978394dda336386707c247a6765f5dfff43764b550a4f5d8a447ad9d98e
[./PDOX40/biblio/REFS.X15](./PDOX40/biblio/REFS.X15) | hash://sha256/23a4fb31b7bb40693f8b36bc680b4f0a1ee38fe1b0097f79419cffd9eb1fdb69
[./PDOX40/biblio/MASTER.YG1](./PDOX40/biblio/MASTER.YG1) | hash://sha256/dda128adddeaec4c9ddcbc774be1771e44dbbe3e54f3949d42ef7805ee808163
[./PDOX40/biblio/HKOLIN.VAL](./PDOX40/biblio/HKOLIN.VAL) | hash://sha256/355b67b0e9882aa3d9a9fff2506b2fe90fd34e742aaf4b2724a5a7cb3f0ca674
[./PDOX40/biblio/HOSTFAM.VAL](./PDOX40/biblio/HOSTFAM.VAL) | hash://sha256/3bf37c943c1f3c60ab3061a39e95a1c8882ad5d0510bb22702877283e23cc848
[./PDOX40/biblio/REFS.X07](./PDOX40/biblio/REFS.X07) | hash://sha256/c3b4aaf4fe9d0aedf3c14119fad84b6be2cd42b02543fb4a7a347cacb0b35ada
[./PDOX40/biblio/DISTOLIN.SET](./PDOX40/biblio/DISTOLIN.SET) | hash://sha256/16c11508200864851d45c6e1e8c1b2d5fefabef0931d9263d3e6cd878113fed9
[./PDOX40/biblio/HOSTS.Y13](./PDOX40/biblio/HOSTS.Y13) | hash://sha256/6105ff122241686e169021ea03383add880465294ae8c8bc81acec91188b1350
[./PDOX40/biblio/MASTER.XG1](./PDOX40/biblio/MASTER.XG1) | hash://sha256/503cbb52359a61d2b80a127ec4edea4fdf28d579b27aa8962200df0c22de01da
[./PDOX40/biblio/REFS.Y07](./PDOX40/biblio/REFS.Y07) | hash://sha256/9464a9f708e95b55f5977374a3ae5c4b7befbad349dc91fc18bd6354ea2f7a63
[./PDOX40/biblio/HOSTOLIN.PX](./PDOX40/biblio/HOSTOLIN.PX) | hash://sha256/0a96df13cebb135f74d0f6af43bb26aa80d909c93fdaedd65cd989d159e3f4b6
[./PDOX40/biblio/MASTER.Y0A](./PDOX40/biblio/MASTER.Y0A) | hash://sha256/575407db36059f2b59af3104236322610600d5b64601bd203e3f229943630fd1
[./PDOX40/biblio/REFEXT.PX](./PDOX40/biblio/REFEXT.PX) | hash://sha256/838e7b8417fec765af939767f7db874d89c6386c0d7ea43b5f5477ea26e72b52
[./PDOX40/biblio/HKOLIN.X03](./PDOX40/biblio/HKOLIN.X03) | hash://sha256/8d62d5dcd2662ff9460878fe1da23463b50610b58b818fa02a27eca3c17a09c0
[./PDOX40/biblio/HOSTOLIN.X02](./PDOX40/biblio/HOSTOLIN.X02) | hash://sha256/405020719759c17dce1996b1759a4bb0835ea4f4a44bffae89f847e93964d73d
[./PDOX40/biblio/GENUS.DB](./PDOX40/biblio/GENUS.DB) | hash://sha256/6cce23ad0e13550b4149e88b84225a1eedffb72c740a2a3d2d110cd5e502f518
[./PDOX40/biblio/MASTER.VAL](./PDOX40/biblio/MASTER.VAL) | hash://sha256/8058fb9cf465a4818fe536019d5cdead42ac355f06d25e7cd899ced5f244a596
[./PDOX40/biblio/HOSTS.VAL](./PDOX40/biblio/HOSTS.VAL) | hash://sha256/680e2736ca0724bec2ee77b0e9e2e9beed3eccab9d17a737d9d1f88c6142d7c5
[./PDOX40/biblio/MASTER.F8](./PDOX40/biblio/MASTER.F8) | hash://sha256/2dabbeb9b4bd4e48f9a51163c522e944eb90bfb395995cceaf8a034543d945f6
[./PDOX40/biblio/SPECIES.F8](./PDOX40/biblio/SPECIES.F8) | hash://sha256/c0b489c3436e6eb1d89e73fee8479a93903182acd16c1ef0b4499f7855ebc4e1
[./PDOX40/biblio/HOSTS.MB](./PDOX40/biblio/HOSTS.MB) | hash://sha256/9b4c30da8392c40589afe93ae9ee11505dd6869f7b8b07d9bc2da03957674df0
[./PDOX40/biblio/REFS.YG0](./PDOX40/biblio/REFS.YG0) | hash://sha256/677668eb6a6a72d9106962a3e961ecab42b9d4ca98705867fb7bf0e3c71439cd
[./PDOX40/biblio/SPECIES.YG0](./PDOX40/biblio/SPECIES.YG0) | hash://sha256/b1aaaa864ca6ac2ea7946c5edf1a66a051a286d8689d10a82b29fbc7a7fb3ad3
[./PDOX40/biblio/HOSTOLIN.F](./PDOX40/biblio/HOSTOLIN.F) | hash://sha256/97be8051e53798ff37e32d04658bf54100f90f8abfab430d6ffcaf27c5486fcd
[./PDOX40/biblio/HOSTOLIN.F2](./PDOX40/biblio/HOSTOLIN.F2) | hash://sha256/69c4e81c117fd848bad0fee7a6d308270bbb5120485b8e3bcf343879978df7c8
[./PDOX40/biblio/DIST.F3](./PDOX40/biblio/DIST.F3) | hash://sha256/4807c6012cd5bd66ce1c6594a5938b72f703714adf2142b150f1fd140646d38a
[./PDOX40/biblio/COUNTRY.SET](./PDOX40/biblio/COUNTRY.SET) | hash://sha256/2ba878f1d8a37509df57bd7cdc325e855932b14b4f9275c6c0f66436a03ce0c2
[./PDOX40/biblio/COLL.SET](./PDOX40/biblio/COLL.SET) | hash://sha256/3047c4b4957a7141de6e13753146ba8b9391f258d05baaeaaa9d78fe7fbd7493
[./PDOX40/biblio/REFS.DB](./PDOX40/biblio/REFS.DB) | hash://sha256/e022431393e434c4161eedcd275aca88d8007b942bf195a313b9e026347624ab
[./PDOX40/biblio/REFEXT.F1](./PDOX40/biblio/REFEXT.F1) | hash://sha256/47cdb9d647178a89c18874dd6a36452e19d964298879eebbfe4b0c54de5c29cd
[./PDOX40/CUSTOM.OV1](./PDOX40/CUSTOM.OV1) | hash://sha256/1016a59831eec5ed75447eded2f9a5e10f258009dd7d653df22253d4b505fe1e
[./PDOX40/MWPRINT.R6](./PDOX40/MWPRINT.R6) | hash://sha256/218006e69a573b1a118e94bf8efb5fa5fe78bb4cea50bdb526d36752c79c419f
[./PDOX40/WSSTART.SC2](./PDOX40/WSSTART.SC2) | hash://sha256/3b76ec09bc2f2eec4ff9a39706ce83ba7c7c839450215592d6718ad410fc4b8f
[./PDOX40/MWPRINT.SET](./PDOX40/MWPRINT.SET) | hash://sha256/1f08d915bdae5ecd124c3ed136219daf61f8c52fc1a9ebe55938d145ab5de2c3
[./PDOX40/NUPDTOS2.ICO](./PDOX40/NUPDTOS2.ICO) | hash://sha256/a575a5eab2efee819e84c3f3b19cc3e3f08fcf8b7dbf6f0042f19355264d94c5
[./PDOX40/MWINPUT.PX](./PDOX40/MWINPUT.PX) | hash://sha256/5a49370461ef429163befc812288cc486fde4578f521af8d7f851d20c3280313
[./PDOX40/EMSTEST.COM](./PDOX40/EMSTEST.COM) | hash://sha256/7cb3007930fc925f94ea82655a56908bc57d7626870548376fdab4bc00331f12
[./PDOX40/hpothb07.tif](./PDOX40/hpothb07.tif) | hash://sha256/7207fd21d1f0faea292de36c921f990c68ee5c7153f43101f90ebf8589b3687f
[./PDOX40/MWPRINT.VAL](./PDOX40/MWPRINT.VAL) | hash://sha256/79c759340664c2c790deac9ea88bc42ecb1c58aae28ee98675c6f80ced717831
[./PDOX40/DECPATH](./PDOX40/DECPATH) | hash://sha256/f523750d4100c8e29eff4c7b957d71658fad5d1ab7b1fddae40dc0e09d1d8efe
[./PDOX40/CUSTOM.SC2](./PDOX40/CUSTOM.SC2) | hash://sha256/e2431c6cf8d4ad77c9ba2e57e8715fa908c51eee196a3dc7804bd0c3b7280b32
[./PDOX40/PUNCTUAT.SC](./PDOX40/PUNCTUAT.SC) | hash://sha256/3e0be7f275d6427f3ab9280aee40a8079f37516a30398d3f7dc7d03edce4ee28
[./PDOX40/TECHINFO.SC](./PDOX40/TECHINFO.SC) | hash://sha256/c76d8e5ffc7e0710a2410252841378e5607dcabbb1aaf422f199f231406c0908
[./PDOX40/TUTILITY.ICO](./PDOX40/TUTILITY.ICO) | hash://sha256/928a66672c572524e06b75a5b00849face82f381b46644a4f767109b93c25e89
[./PDOX40/COUNTRY.PAK](./PDOX40/COUNTRY.PAK) | hash://sha256/722f16543af24f34f4afc74fe3c5a970b65bce5d8ce049ddff1ff2c7b32d955b
[./PDOX40/PARADOX.HLP](./PDOX40/PARADOX.HLP) | hash://sha256/9ba86f803e817a799a33885b71253f25117efdc4f40aa8886e58924358f29d4f
[./PDOX40/PDOXDOS.PIF](./PDOX40/PDOXDOS.PIF) | hash://sha256/a3169f24e51311831ae3f6b7194faf34a0ddfd49de7b41843f21446a66e68079
[./PDOX40/3CSHARE](./PDOX40/3CSHARE) | hash://sha256/6756299eda9973533e8550ddb50ad8e376138283594c0438b6287a33554bcc4e
[./PDOX40/SANS.CHR](./PDOX40/SANS.CHR) | hash://sha256/edd4db0e5735ce0872d60137819e2b74a590d069be7585269b7b6d675e319bbc
[./PDOX40/ASCII.SOR](./PDOX40/ASCII.SOR) | hash://sha256/de048a5bf808a099303c029b81a2d0320d9967c44c82fbd1c66500877a79811f
[./PDOX40/MWINPUT.MB](./PDOX40/MWINPUT.MB) | hash://sha256/0f4ef8539a16209f798ca90dd9b86b4eeea348440dd9297e6e28327809cdee7c
[./PDOX40/SYSTEM.PAK](./PDOX40/SYSTEM.PAK) | hash://sha256/57eea1486c6de0691c83207aff73894f5259e82dc8eb764cce7ac99aa2c786ea
[./PDOX40/CGA.BGI](./PDOX40/CGA.BGI) | hash://sha256/c77f6051cb7496ce588416051211566204da27d6985ddf5f3235d3f3793cc1b7
[./PDOX40/IMW.SC](./PDOX40/IMW.SC) | hash://sha256/1782f797e59aff71d91e72da009b1e741ba525c4cb959115961c7e59a8733e3d
[./PDOX40/LANSRVR](./PDOX40/LANSRVR) | hash://sha256/786a3b31d387f616ae66d22815c9bfd573aba19f35e6d32499ae75e0cfe8401e
[./PDOX40/NUPDATE.EXE](./PDOX40/NUPDATE.EXE) | hash://sha256/0c790df1ab465578c0b31dd7af768de98bc710dffc447d0440d537c8803bb0e7
[./PDOX40/MODELS.RPT](./PDOX40/MODELS.RPT) | hash://sha256/f32b58e9f4443f89229aa87fc25c3f1e92609925f01ea82b623b6d40502575b3
[./PDOX40/GITASC.MB](./PDOX40/GITASC.MB) | hash://sha256/5d34776099186b45fce0a2a391708af5cdb083581d0e3ec6d3d037fa482e4962
[./PDOX40/MWINPUT.F1](./PDOX40/MWINPUT.F1) | hash://sha256/8d32c9ad13ee396e50132558cec00f3cdf7d3bb5dfb8e7f33e98a024638ba175
[./PDOX40/BMMODELS.RPT](./PDOX40/BMMODELS.RPT) | hash://sha256/0814fda9e241f4c0781e8a3f5f48639d48339f4581e1d76615eef263345769d7
[./PDOX40/INIT.SC](./PDOX40/INIT.SC) | hash://sha256/8930b9cbf2324c2cd73d034805406b5b1a8530658c5261b9dab33bb179f5acde
[./PDOX40/PARADOX.VID](./PDOX40/PARADOX.VID) | hash://sha256/d837cf8af20fd2e47e65e66c4733f42fea7fd14cac8e39fd6aa28abcec388c3d
[./PDOX40/PARADOX.IDX](./PDOX40/PARADOX.IDX) | hash://sha256/e2f533e7beaf12a78a9c871d81e52d2846391aa0c8e2e7c34c95db2bacf0a3d8
[./PDOX40/PDOXDOS.ICO](./PDOX40/PDOXDOS.ICO) | hash://sha256/6794d84c1b7fe65f6f462e18b9e9f5a0f4e64f05ef76439cbfc90484d9954433
[./PDOX40/PARADOX.AUX](./PDOX40/PARADOX.AUX) | hash://sha256/ec62da1339db039247ca03c223369d58f6db78e6ec234dabc6326de788a45b9a
[./PDOX40/PARADOX.OV2](./PDOX40/PARADOX.OV2) | hash://sha256/8c9dfcbad477844f75230d3d5be32b73cbe5aa54a49984772ab8829d19e559b3
[./PDOX40/FIX.BAT](./PDOX40/FIX.BAT) | hash://sha256/d43e5827364ada30825467ca10e244ea2cd5a912b1412e95a1ee591169a145ba
[./PDOX40/SIMP.CHR](./PDOX40/SIMP.CHR) | hash://sha256/8d51af7680da29886481166fbc352141e6c615dd97927521b06cb2548f940acf
[./PDOX40/MWPRINT.F2](./PDOX40/MWPRINT.F2) | hash://sha256/80ace604f7b0dfec914dba56240f071da4c3045b6032f80007af194387f3bcf4
[./PDOX40/JOURNALS.SC](./PDOX40/JOURNALS.SC) | hash://sha256/7e7f2501fcc3d34996c527059657489d3fa7fd5ff36e991e67b683389f124eab
[./PDOX40/MWPRINT.PX](./PDOX40/MWPRINT.PX) | hash://sha256/5d77d088cb0394fd8c057b2cd3a69e6629f4b34309930b6c4bcaa40cb9dd3138
[./PDOX40/TRIP.CHR](./PDOX40/TRIP.CHR) | hash://sha256/831963618a5dbf3562e12c3b4b8bab3ed3879143de3c7cd9293be171a44282db
[./PDOX40/LCOM.CHR](./PDOX40/LCOM.CHR) | hash://sha256/69d210b35c0c3e74cb6cfe9062b471579c43f3cf12fcc8c76f63b96235e9d9bb
[./PDOX40/TUTILITY/TUTILITY.CFG](./PDOX40/TUTILITY/TUTILITY.CFG) | hash://sha256/720958e24367af0a01be15df76d2f52bf5ac7bb30ab742ca039ad06f12b30bcd
[./PDOX40/TUTILITY/TUTILITY.DOC](./PDOX40/TUTILITY/TUTILITY.DOC) | hash://sha256/f297b7d3de801623fe49eab7dff9741f6ca8c11a30e338d4a0ee3a35d48188da
[./PDOX40/TUTILITY/TUTILITY.EXE](./PDOX40/TUTILITY/TUTILITY.EXE) | hash://sha256/748940eb346cfbecb7520d5978518c8e2b3afd72fb317e8343ce9463a7dcda1d
[./PDOX40/PC3270.BGI](./PDOX40/PC3270.BGI) | hash://sha256/0019ec84739615fe2a9c5299c461e941bc9833bba1b656248870626f2a8a9b10
[./PDOX40/CUSTOM.SC](./PDOX40/CUSTOM.SC) | hash://sha256/42be310c7c2aa022cbb1bb090c6b82eeb75fa90d6aeec72c6c338e05b366173a
[./PDOX40/PARADOX.SOM](./PDOX40/PARADOX.SOM) | hash://sha256/1ca4b35bc81d9c7168e2ed5f3b890d07aa6c8fdd0dd72a54e6d861e09d154bf4
[./PDOX40/BANYAN](./PDOX40/BANYAN) | hash://sha256/230ddc2edf1984f8c998d509df7d20e8e5146e60aa348031a75bc9165f984333
[./PDOX40/PARADOX.MSG](./PDOX40/PARADOX.MSG) | hash://sha256/d5cb83c38aba0dc66c7f6e8b4650ca9fb772c3c7e62088f0dc81215b61c3e6f7
[./PDOX40/CPUTEST.EXE](./PDOX40/CPUTEST.EXE) | hash://sha256/29618dd41b491986f3748eed5fec8db8f708bdd166d31b3befbde6cd0f6b3ca3
[./PDOX40/LANGUAGE.DB](./PDOX40/LANGUAGE.DB) | hash://sha256/7b08b8bfd922cb7b103d96b46b40796f5c18fe4879226fadcfed2b6559586976
[./PDOX40/EURO.CHR](./PDOX40/EURO.CHR) | hash://sha256/783392b9fd0414a9c768db7741808811de63c599b34f92acb2d967e74993c6b1
[./PDOX40/hpothb07.dat](./PDOX40/hpothb07.dat) | hash://sha256/e8e3527df332ec1c3aa46e2d97dc72e2c6ae370e2b367fbc5ba00e3779bee910
[./PDOX40/PDOXOS2.ICO](./PDOX40/PDOXOS2.ICO) | hash://sha256/1073696b9401d378e353922970b3d70bf31d18361a9fb727090a6f684bdf5494
[./PDOX40/BOLD.CHR](./PDOX40/BOLD.CHR) | hash://sha256/1e6a7d85c4eae066ff8a960a5c3d67b7832240d35a0a287cb08b587393c20833
[./PDOX40/IMW.SC2](./PDOX40/IMW.SC2) | hash://sha256/08083c11da77d3a78d62b712435c66658ef74197f244741e185c7232125b4eaa
[./PDOX40/TUTILITY.PIF](./PDOX40/TUTILITY.PIF) | hash://sha256/298f97c0905dd16f601f7e23c1cae959dff3d714e803ec6a484f60e99679fcd4
[./PDOX40/DPMIINST.EXE](./PDOX40/DPMIINST.EXE) | hash://sha256/37fb638f388ac1f9b11c55d2bfb092b3bba64d07d042e4f2439931670d3d1372
[./PDOX40/PATCH.DOC](./PDOX40/PATCH.DOC) | hash://sha256/563332458f0921cf60103b75220fa5e01d70cb3ce7bf9cc8b6a3c9db2140df81
[./PDOX40/MWINPUT.F2](./PDOX40/MWINPUT.F2) | hash://sha256/03fb3afaf3ebfc3893cc7a12a682cb552828a5dc9f9484dc17e6f9780a4237a6
[./PDOX40/HELPME.TXT](./PDOX40/HELPME.TXT) | hash://sha256/9adf9b92288015874a8ca19aa5353576160c31f2fc64d065753e941697be499c
[./PDOX40/TUTILOS2.ICO](./PDOX40/TUTILOS2.ICO) | hash://sha256/4be848e80d5973d664f9082b971aaed5b9fd5d4317f9ddc608b3e474dcdd325d
[./PDOX40/TUTILITY.HLP](./PDOX40/TUTILITY.HLP) | hash://sha256/877327a47c34c5997746be649779be559ba2385bd391965626da8a93ed4c452e
[./PDOX40/WSSTART.SC](./PDOX40/WSSTART.SC) | hash://sha256/89b016236f21254ec333e0327293cb22835547bf9bbfabff43eb1a5af11ecfc7
[./PDOX40/README](./PDOX40/README) | hash://sha256/46dc13e6cc74c1df9f5b007d8fbbab1a3ec3ebf7f96596b594d76953df2da219
[./PDOX40/MWINPUT.VAL](./PDOX40/MWINPUT.VAL) | hash://sha256/28f218934b61e8b20721315ef3eef7a251974298f16714f47e1a80b2e60b5370
[./PDOX40/PDOXOS2.CMD](./PDOX40/PDOXOS2.CMD) | hash://sha256/09f686d813fb9ec8bef9c2d7cbc5d51ee0bbbcb0e09f3847a2efdded5b89a6c8
[./PDOX40/GWB.SC2](./PDOX40/GWB.SC2) | hash://sha256/dadd9d83614a9346d9093f799b6f54a79ffdd5da5d90613252e366f270a6ed46
[./PDOX40/MWINPUT.SET](./PDOX40/MWINPUT.SET) | hash://sha256/8d150659647e33080055bb408c54352e0d6736c0b4511eeaaeb70146d83232bd
[./PDOX40/NETWORK.TXT](./PDOX40/NETWORK.TXT) | hash://sha256/7c2ee769b6beb72a4be6cd9ffb700ae98febb536a4e17689ec261b0bb1878491
[./PDOX40/INSTANT.SC](./PDOX40/INSTANT.SC) | hash://sha256/c6a9fc343a527fc9bacbc8172703e2757bde89b98425477d90b3b1ccc09ad540
[./PDOX40/PARADOX-.PIF](./PDOX40/PARADOX-.PIF) | hash://sha256/2073ceed39f924e8874ceba43c47b4e20af8606021ac03ec39d1d297beec3445
[./PDOX40/PARADOX1.PIF](./PDOX40/PARADOX1.PIF) | hash://sha256/2073ceed39f924e8874ceba43c47b4e20af8606021ac03ec39d1d297beec3445
[./PDOX40/NUPDATE.ICO](./PDOX40/NUPDATE.ICO) | hash://sha256/0b848ac3bf147bd3d5fc1774901fcd1041439ac2981f7a828cd4656c73957cd7
[./PDOX40/DPMI16BI.OVL](./PDOX40/DPMI16BI.OVL) | hash://sha256/d6dddcdbcc7a14f6dfb8a363e2205af2ff06aba69c29f3e2f2aeb2ed66d48eb5
[./PDOX40/COUNTRY.ZIP](./PDOX40/COUNTRY.ZIP) | hash://sha256/69465e1a6ed23a1076846914d2f6304a5824989f4ab84f3ae4de36ddcd00e28c
[./PDOX40/VOUCH.EXE](./PDOX40/VOUCH.EXE) | hash://sha256/a8f7e860ad34b10c26dfc9bdcd23c6b41bd0aa4fba3ec46efd6ba06168968467
[./PDOX40/TUTILOS2.CMD](./PDOX40/TUTILOS2.CMD) | hash://sha256/cf8ad11098a71add8fdb8134b4332b9857bfbac32198decdb59adc21a76e8080
[./PDOX40/MWPRINT.MB](./PDOX40/MWPRINT.MB) | hash://sha256/0f4ef8539a16209f798ca90dd9b86b4eeea348440dd9297e6e28327809cdee7c
[./PDOX40/ATT.BGI](./PDOX40/ATT.BGI) | hash://sha256/b289edc3b9f90865338af9d8f2521766fd029afe4e1a3e284ca172c6a40e7f0e
[./PDOX40/YOMDP.DLL](./PDOX40/YOMDP.DLL) | hash://sha256/4bfb2d04162693b1ee08e7318d1435f8fed6108bdf7c5df04dea2b92ef07e4f9
[./PDOX40/PDOXDOS.LNK](./PDOX40/PDOXDOS.LNK) | hash://sha256/2d0a831db9c4d0d20ed216e55bb9978c60a49629730459d222195aecc93cabe7
[./PDOX40/UNZIP.EXE](./PDOX40/UNZIP.EXE) | hash://sha256/eadec5237c31993924b9f5095b7d4fb21b1035321c70daa7c29ce71d0a6c1824
[./PDOX40/MWINPUT.DB](./PDOX40/MWINPUT.DB) | hash://sha256/308e68eae26b5f339bd8e1be9f7d115c3b1d8b63ea3de9ef799e6253217ec388
[./PDOX40/DPMI1ALT.OVL](./PDOX40/DPMI1ALT.OVL) | hash://sha256/caa46d147372ce3818afc2097b2dd1f6ba39d5a9493d85167559ac4e9a9afe5a
[./PDOX40/PARADOX.OV1](./PDOX40/PARADOX.OV1) | hash://sha256/a6ddd5695d2687d0ddde0c03bb764ef5724b6f74604e7d6687de6b872761a3d2
[./PDOX40/PARADOX.ADD](./PDOX40/PARADOX.ADD) | hash://sha256/73bc133eceffc19408cf91791c621a319fa01a146ab8b6d941a572e9625cbfa9
[./PDOX40/DPMILOAD.EXE](./PDOX40/DPMILOAD.EXE) | hash://sha256/6abf753cb90325504977389ab7f62bd6c73674eb86865b4c9231cf9eb638f2ec
[./PDOX40/INTL.SOR](./PDOX40/INTL.SOR) | hash://sha256/fa07b313be60346494d7b58d72e567e9a3ebbf77d3f904437e1c4a14e4a0a671
[./PDOX40/TSCR.CHR](./PDOX40/TSCR.CHR) | hash://sha256/4ee4bd987d46de4539d6f27aaa434ed82b656f0d0e64e3f6dad827afda1667a3
[./PDOX40/PARADOX.CFG](./PDOX40/PARADOX.CFG) | hash://sha256/66b475e0bedcd18413fc6d20ad1030f6e226055c667eb48e5ce90109382e5886
[./PDOX40/GOTH.CHR](./PDOX40/GOTH.CHR) | hash://sha256/8620ae9db9dd874b842f67f7153721a5681fef3cd9e99af0fde41f3b1194f183
[./PDOX40/PDOXPORT.PS](./PDOX40/PDOXPORT.PS) | hash://sha256/29de4794414d59e4dccf2eb1ae95dfaf3f608c8d45a63988e546ccf2185169ab
[./PDOX40/GWB.SC](./PDOX40/GWB.SC) | hash://sha256/d3804e9461aa2a10e7118d0f08ccfdb3a5ef61c3c03e93e6faf08ef0fccdc670
[./PDOX40/TECHINFO.LIB](./PDOX40/TECHINFO.LIB) | hash://sha256/7bb184f040217bae1abed9bb94f8053caf3db96f1fcd2581cc3268e2c4af1a85
[./PDOX40/SCRI.CHR](./PDOX40/SCRI.CHR) | hash://sha256/04fde2931ba5392c55791b0c99c0c6790cfae97e9792b5833e40e87e19730bf7
[./PDOX40/MWPRINT.F1](./PDOX40/MWPRINT.F1) | hash://sha256/d4f9f9152b29ef1f80ca25f7996f077591f2bf23ebe8c8ccd3b9cb0009f074e7
[./PDOX40/ATTSTAR](./PDOX40/ATTSTAR) | hash://sha256/c1e7584319899ec959ac9e0f1c4371c1ab05c2644a8fc838f68ee5212b65f17c
[./PDOX40/MWPRINT.DB](./PDOX40/MWPRINT.DB) | hash://sha256/ae012bdaa6885bf4c1bd71fbce7ea1f18fdd765d55cc8e239aefc292f5ed61b7
[./PDOX40/PDOXUSRS.NET](./PDOX40/PDOXUSRS.NET) | hash://sha256/1397f1615cd64f0efc181f74bdd01a12a31135e8ef9d46ef5f0ade4b3e510f40
[./PDOX40/TEST.BAT](./PDOX40/TEST.BAT) | hash://sha256/504f16a369fb0f70b9dfd0f6341a691d73a4070dfe65a54298ac7b387fe49a1f
[./PDOX40/NUPDATE.PIF](./PDOX40/NUPDATE.PIF) | hash://sha256/cd82abca5ee6e76cbcd6436ea2fc51552e629c39802a9e4c4aa76acdd1f63abf
[./PDOX40/FILELIST.TXT](./PDOX40/FILELIST.TXT) | hash://sha256/d517ef8e4b59258b4f9f4120a5b59404429fa22571dfe8cfbebef07f58da7909
[./PDOX40/TEMPDEL.DB](./PDOX40/TEMPDEL.DB) | hash://sha256/b7085c7bc62679728fbc59682a0c40a93d9f2bc43dc0bec0414f2e3c999b9d0c
[./PDOX40/MSLANMAN](./PDOX40/MSLANMAN) | hash://sha256/0b4296cd4e86dd2fcce73581cc3e66dfe93a03017f4fab95eadcdb706edb6eac
[./PDOX40/NOVELL](./PDOX40/NOVELL) | hash://sha256/6fbd981d6ebf080a11d38068dda2e4186d481541a8e7bcf10e5a6c74ece89629
[./PDOX40/MWINPUT.R6](./PDOX40/MWINPUT.R6) | hash://sha256/21ae34f9102b9a6861a0c21ec708106b1488cf651b8fe57f7ef4bb8295b691ba
[./PDOX40/VETS.SC2](./PDOX40/VETS.SC2) | hash://sha256/df12a0952be6994ed1755153cab87f326b9ebe4f5aaece67619d8c7dbc356550
[./PDOX40/CUSTOM.LIB](./PDOX40/CUSTOM.LIB) | hash://sha256/f05457799e79338e74dbd0adb53819da0a1e560e9c65fff921af8db1370c8ae9
[./PDOX40/VETS.SC](./PDOX40/VETS.SC) | hash://sha256/72dc2a9e1189d631041d59f91dd77f26c304318867a1697261a86acb55f706b3
[./PDOX40/PDOX40.CMD](./PDOX40/PDOX40.CMD) | hash://sha256/37262bf4421d3b51de3827748fbf979504d9d7c418aab19b920c97f126e7c0ad
[./PDOX40/SPEED.BAT](./PDOX40/SPEED.BAT) | hash://sha256/21d83c038d43217e93842dc5e8abfe03ae8e4c01010a1376eecc0b72c7225365
[./PDOX40/PARADOX.EXE](./PDOX40/PARADOX.EXE) | hash://sha256/beb3c3f45af9d2dd704072c5d4b16fab866a0091f78ae93f2f1b495877ecadd8
[./PDOX40/EGAVGA.BGI](./PDOX40/EGAVGA.BGI) | hash://sha256/a85fd3bc2901a8a3682bc723b05a41ca5f04a2ba8931143748eecd4f7c9cce9b
[./PDOX40/INIT.SC2](./PDOX40/INIT.SC2) | hash://sha256/2fc5f8f8d699e5ea29519d963aee2b4edbe88b3743cb1a98fa6ef2516fe23418
[./PDOX40/IBM8514.BGI](./PDOX40/IBM8514.BGI) | hash://sha256/a621e3e990fd163fc63e3306e4f3fc5e2bcc7b72efe961223dfb0243936a6e1d
[./PDOX40/README.COM](./PDOX40/README.COM) | hash://sha256/b38cc8761d720cba462af38a3abc7e5cfdac50c30a1d25826f2c04dcb238c0df
[./PDOX40/PUNCTUAT.SC2](./PDOX40/PUNCTUAT.SC2) | hash://sha256/fe04c41e774637ca1fd993f15e4a84423fcfa2633a1221958e6558821515c215
[./01-Flowchart.pdf](./01-Flowchart.pdf) | hash://sha256/27b3b68f7109f29a7a0894d0a75fd2efb01e561fb0038232963a1d213d03767f
[./00-Instructions.pdf](./00-Instructions.pdf) | hash://sha256/2b674998220ad7f36a651e93ea65b996b70e76d69cf92bd77b5698a858f51a18
[./Instructions(Please%20read%20first).pdf](./Instructions(Please%20read%20first).pdf) | hash://sha256/2b674998220ad7f36a651e93ea65b996b70e76d69cf92bd77b5698a858f51a18
[./02-TableStructures.pdf](./02-TableStructures.pdf) | hash://sha256/398b2dc74c81ff3a761103198e549ed40a7f422d99a4dc2a3fb6167d5ee04a60
[./DBaseIV/COUNTRY.DBF](./DBaseIV/COUNTRY.DBF) | hash://sha256/30bf568dad8211e8e9521819e416b7c70f84ac5c057de98d5b08d1bb4a7a8c90
[./DBaseIV/REFS.DBF](./DBaseIV/REFS.DBF) | hash://sha256/6238207fa43573e752333d008bfb71d8730a2a4f8b6d6cf5dcc537e5e7dda549
[./DBaseIV/MASTER.DBF](./DBaseIV/MASTER.DBF) | hash://sha256/111baced9cb5fe9605087d634a1b7f80ffff15aa85aae60812e8d74065d06a08
[./DBaseIV/FAMTRIB.DBT](./DBaseIV/FAMTRIB.DBT) | hash://sha256/def11f5cdfcfbf49b18c3af3ccce445989dd9053903e8293329bf3d8c879ef74
[./DBaseIV/DIST.DBT](./DBaseIV/DIST.DBT) | hash://sha256/909664e68241f0075dea2982779ff7865dc8b23d31fbd95e3984ae37404ce344
[./DBaseIV/HKNEW.DBF](./DBaseIV/HKNEW.DBF) | hash://sha256/eaf5cbbf919d4d5c4c17f16e488ea222c4aea0534a71d7eb3b815ce557f4d86b
[./DBaseIV/TSTAT.DBT](./DBaseIV/TSTAT.DBT) | hash://sha256/85b6d882b2dffc2ae6b80a1b2eed911c6bf77cae87d6c3a35afb265100920b00
[./DBaseIV/HOSTS.DBT](./DBaseIV/HOSTS.DBT) | hash://sha256/71119da75bcde907f5db04f16724f8802647abe449af88dc2585377d1bb6ff22
[./DBaseIV/RELIABLE.DBF](./DBaseIV/RELIABLE.DBF) | hash://sha256/13de551e64b19f8e2fe0b5f71dd5f12ecba042212b4688e7cda2b1eb85bffc9c
[./DBaseIV/FAMTRIB.DBF](./DBaseIV/FAMTRIB.DBF) | hash://sha256/135b836c8d743be91054f9fd2663ce1b925173170102771a2080477ad64e0adf
[./DBaseIV/GENUS.DBT](./DBaseIV/GENUS.DBT) | hash://sha256/3a92960e42cd40f49c4a69e52e55703743bdc3aa87a99cca7f917d94b9ce6936
[./DBaseIV/TRAN.DBF](./DBaseIV/TRAN.DBF) | hash://sha256/038dbcb305dbcc3cd61716500452f4efabc8ca0cc496dce7757d754c65a66418
[./DBaseIV/P-TYPE.DBF](./DBaseIV/P-TYPE.DBF) | hash://sha256/3d2001392791b96b03344cd0be1b089fe729b123034175db4ec380876244d577
[./DBaseIV/DIST.DBF](./DBaseIV/DIST.DBF) | hash://sha256/36217a06a772897538e1ad1b134cdf4e8c9dc80b2c2d741866e858dd5efd50ae
[./DBaseIV/HOSTS.DBF](./DBaseIV/HOSTS.DBF) | hash://sha256/77b2de49b7ef0e72e11c3d3a03da1c1060bf28f86ba0e5c83243007d1fe67844
[./DBaseIV/H-FAM.DBF](./DBaseIV/H-FAM.DBF) | hash://sha256/1752540a78032fe5fb72413c1b646fa4cf9ad6591abecbc660e7bf0bd729beba
[./DBaseIV/RELATION.DBF](./DBaseIV/RELATION.DBF) | hash://sha256/8260cc66863509e423f2a323e41200beddde31479d191faf4683659886095a32
[./DBaseIV/SPECIES.DBT](./DBaseIV/SPECIES.DBT) | hash://sha256/c266839c1ff6dc11beb53fbc6a40bcf8d198bd451ab9c015e28ef54f6801013a
[./DBaseIV/TSTAT.DBF](./DBaseIV/TSTAT.DBF) | hash://sha256/d7e73f32be148ad5ae6f03f22a512f0069f4d1f20215edc4cec33544433647e2
[./DBaseIV/GENUS.DBF](./DBaseIV/GENUS.DBF) | hash://sha256/3c0c4375c5d5549f783cb2c793c3c05c8607ce5623bff0561a1dd016e99e858c
[./DBaseIV/WWWIMAOK.DBF](./DBaseIV/WWWIMAOK.DBF) | hash://sha256/7ff1d7c1657009cd39ff11090725a5e68b667631e25f4acce863f9b701870d18
[./DBaseIV/HKNEW.DBT](./DBaseIV/HKNEW.DBT) | hash://sha256/4730d9e9f3eec3c4102bfe726b547fd9f1dea850d4749a2ff2c5d4392d174d35
[./DBaseIV/COLL.DBF](./DBaseIV/COLL.DBF) | hash://sha256/e2008e46eeb1dcf3edd0c25b623d5f5f8a43129c7bf2bffaee958dcd8b8346b2
[./DBaseIV/STATUS.DBF](./DBaseIV/STATUS.DBF) | hash://sha256/5a98afcb70350ca12f6360bef0132a56ba18b94f9526dd171cfdd210fc2d7fce
[./DBaseIV/SPECIES.DBF](./DBaseIV/SPECIES.DBF) | hash://sha256/b9552db0fa06aec5a52c3d71613e990016bec3863689b7bcdd6744e4ac392c53
[./DBaseIV/KEYWORDS.DBF](./DBaseIV/KEYWORDS.DBF) | hash://sha256/35159811508d50e2319114f5f7c2bdf9b7c7d4fc15bd1077ea01e98d2d715ce6
[./DBaseIV/LANGUAGE.DBF](./DBaseIV/LANGUAGE.DBF) | hash://sha256/4cdabce97cd0b3a60c6c08be89eba1b0d4232097dc169753039878e8c6e0bda8
[./DBaseIV/FGNAMES.DBF](./DBaseIV/FGNAMES.DBF) | hash://sha256/a72f330312eb928d639c57f80e83fac5912f6d262e52bea37f102533f2229a0f
[./DBaseIV/HOSTFAM.DBF](./DBaseIV/HOSTFAM.DBF) | hash://sha256/1dde857581e773f09907c8f85af421dfacb9d3bcca9652cccaa5b86838fc15c3
[./DBaseIV/REFEXT.DBF](./DBaseIV/REFEXT.DBF) | hash://sha256/25290e5c9cb8b95f8a13809865e39207c6e42d95dd9574e62561c4168c92de48


## References

[1] MJ Elliott, JH Poelen, JAB Fortes (2020). Toward Reliable Biodiversity Dataset References. Ecological Informatics. [https://doi.org/10.1016/j.ecoinf.2020.101132](https://doi.org/10.1016/j.ecoinf.2020.101132)

[2] Elliott, M. J., Poelen, J. H., & Fortes, J. (2023, accepted with minor revisions). Signed Citations: Making Persistent and Verifiable Citations of Digital Scientific Content. [https://doi.org/10.31222/osf.io/wycjn](https://doi.org/10.31222/osf.io/wycjn)

