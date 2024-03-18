class Tsamts{
    public:
        int size;
        char color;
        char material;
        int hantsiunii_urt;
};
class Umd {
    public:
        int size;
        char color;
        char material;
        int suudliin_hemjee;
};
class Gutal {
    public:
        int size;
        char color;
        char material;
        int udees;
};

class Huvtsas {
    public:
        int size;
        char color;
};
class Tsamts: public Huvtsas{
    public:
        int hantsiunii_urt;
};
class Umd: public Huvtsas {
    public:
        int suudliin_hemjee;
};
class Gutal: public Huvtsas {
    public:
        int udees;
};

