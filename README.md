# ucd
[`download` 📦](https://github.com/jhpoelen/ucd/archive/6243195684725d019217fc4d823e6fd865da19ff.zip) 

[![SWH](https://archive.softwareheritage.org/badge/swh:1:dir:95a3ac018d59730f6648caf9c553b8acff1af7db/)](https://archive.softwareheritage.org/swh:1:dir:95a3ac018d59730f6648caf9c553b8acff1af7db;origin=https://github.com/jhpoelen/ucd;visit=swh:1:snp:e5726ecf2e2f19174172c7d36ef41e238a23f8de;anchor=swh:1:rev:5160d49751901b3cfd9b37ff950fc43214c2c023)

[![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.7847600.svg)](https://doi.org/10.5281/zenodo.7847600)

This repository contains an archival copy of the Universal Chalcidoidea Database (UCD) by J.S. Noyes in their original [Paradox Database](https://en.wikipedia.org/wiki/Paradox_%28database%29) file format. 

All files were provided by J.S. Noyes on 2023-03-18 and consent was given to publish the data under CC0.

For getting started, please see the [`Instructions`](./Instructions%28Please%20read%20first%29.pdf) first. Then, suggest to take a look at a [`Flowchart`](./Flowchart.pdf) and the [`Table Structure`](./TableStructure.pdf).

## Citation
On use of this data, please follow academic tradition and cite the data using:  

Noyes, J.S. March 2019. Universal Chalcidoidea Database. World Wide Web electronic publication. http://www.nhm.ac.uk/chalcidoids. hash://sha256/dc3f137ed7e456dd964545527cfff3acc3c1655baeaebecb6d07cdf3e1bbd549 hash://md5/7167f39628ac3d4434b7302133c79a1c .

## Signed Content 

Using Preston [1,2], the UCD content was packaged and their provenance was signed.

```bash
preston history\
 --anchor hash://sha256/dc3f137ed7e456dd964545527cfff3acc3c1655baeaebecb6d07cdf3e1bbd549\
 --remote https://raw.githubusercontent.com/jhpoelen/ucd/main/data\
 --remote https://zenodo.org/record/7844167/files\
 --remote https://softwareheritage.org\
 --remote https://linker.bio
```

yielded:

```
<hash://sha256/dc3f137ed7e456dd964545527cfff3acc3c1655baeaebecb6d07cdf3e1bbd549> <http://www.w3.org/ns/prov#wasDerivedFrom> <hash://sha256/298581b34133b518f251f4321f1920488afd923f3308e45b9c1d169da0e16b5b> .
<hash://sha256/298581b34133b518f251f4321f1920488afd923f3308e45b9c1d169da0e16b5b> <http://www.w3.org/ns/prov#wasDerivedFrom> <hash://sha256/dc3f137ed7e456dd964545527cfff3acc3c1655baeaebecb6d07cdf3e1bbd549> .
<hash://sha256/dc3f137ed7e456dd964545527cfff3acc3c1655baeaebecb6d07cdf3e1bbd549> <http://www.w3.org/ns/prov#wasDerivedFrom> <hash://sha256/eb416c97bf52a36b31ece2b47431a6a4a9bda7f52b9bc8ccb92f91f5c1bdf268> .
<urn:uuid:0659a54f-b713-4f86-a917-5be166a14110> <http://purl.org/pav/hasVersion> <hash://sha256/eb416c97bf52a36b31ece2b47431a6a4a9bda7f52b9bc8ccb92f91f5c1bdf268> .
```

and can be cloned using

```bash
preston clone
 --anchor hash://sha256/dc3f137ed7e456dd964545527cfff3acc3c1655baeaebecb6d07cdf3e1bbd549\
 --remote https://raw.githubusercontent.com/jhpoelen/ucd/main/data\
 --remote https://zenodo.org/record/7844167/files\
 --remote https://softwareheritage.org\
 --remote https://linker.bio
```

with associated content cataloged via 

```bash
preston alias
 --anchor hash://sha256/dc3f137ed7e456dd964545527cfff3acc3c1655baeaebecb6d07cdf3e1bbd549\
 --remote https://raw.githubusercontent.com/jhpoelen/ucd/main/data\
 --remote https://zenodo.org/record/7844167/files\
 --remote https://softwareheritage.org\
 --remote https://linker.bio
```

 content location | content id 
 --- | --- 


## References

[1] MJ Elliott, JH Poelen, JAB Fortes (2020). Toward Reliable Biodiversity Dataset References. Ecological Informatics. [https://doi.org/10.1016/j.ecoinf.2020.101132](https://doi.org/10.1016/j.ecoinf.2020.101132)

[2] Elliott, M. J., Poelen, J. H., & Fortes, J. (2023, accepted with minor revisions). Signed Citations: Making Persistent and Verifiable Citations of Digital Scientific Content. [https://doi.org/10.31222/osf.io/wycjn](https://doi.org/10.31222/osf.io/wycjn)

