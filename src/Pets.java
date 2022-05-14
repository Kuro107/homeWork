public class Pets {
    Parrot parrots;
    Dog dogs;
    Cat cats;
    Fishes fishes;

    public Parrot getParrots() {
        return parrots;
    }

    public void setParrots(Parrot parrots) {
        this.parrots = parrots;
    }

    public Dog getDogs() {
        return dogs;
    }

    public void setDogs(Dog dogs) {
        this.dogs = dogs;
    }

    public Cat getCats() {
        return cats;
    }

    public void setCats(Cat cats) {
        this.cats = cats;
    }

    public Fishes getFishes() {
        return fishes;
    }

    public void setFishes(Fishes fishes) {
        this.fishes = fishes;
    }

    @Override
    public String toString() {
        return "parrots = " + parrots + "\n" +
                "Dogs = " + dogs + "\n" +
                "Cats = " + cats + "\n" +
                "Fishes = " + fishes;
    }
}
        class Parrot {
            private String sex;
            private int age;

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
            @Override
            public String toString(){
                return "Parrots sex = " + sex + "\n" +
                        "Parrots age= " + age + "\n";
            }
        }

        class Dog {
           private String name;
           private int voiceLevel;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getVoiceLevel() {
                return voiceLevel;
            }

            public void setVoiceLevel(int voiceLevel) {
                this.voiceLevel = voiceLevel;

            }
            @Override
            public String toString(){
                return "Dogs name = " + name + "\n" +
                        "Dogs voiceLevel= " + voiceLevel + "\n";
            }
        }

        class Cat {
            private String breed;
            private int livesLeft;

            public String getBreed() {
                return breed;
            }

            public void setBreed(String breed) {
                this.breed = breed;
            }

            public int getLivesLeft() {
                return livesLeft;
            }

            public void setLivesLeft(int livesLeft) {
                this.livesLeft = livesLeft;
            }
            @Override
            public String toString(){
                return "Cats breed = " + breed + "\n" +
                        "How many lives do cats have left  " + livesLeft + "\n";
            }
        }

        class Fishes {
           private String color;
           private int size;

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }
            @Override
            public String toString(){
                return "fishes color = " + color + "\n" +
                        "fishes size " + size + "\n";
            }
        }


