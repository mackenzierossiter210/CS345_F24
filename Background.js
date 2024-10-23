class Background {
    constructor() {
        this.angle = 10;
        this.dog = "dog image";
        this.bgDay = "day image";
        this.sunImage = "assets/image-from-rawpixel-id-7619893-png.png";
        this.bgMidDay = "mid day image";
        this.bgDusk = "dusk image";
    }

    
    sunAnimation() {
        
        let radius = 375; // Radius of the circle
        background(220);
        let x = (width / 2 + cos(this.angle) * radius) - 50;
        
        let y = (height / 20 + sin(this.angle) * radius) + 350;
        image(this.imgSun, x, y);
        this.imgSun.resize(125, 0);
        if (y < 200) {
            this.angle += .0025;
        } else {
            this.angle += 0.25; 
        }

        

    }

    preload() {
        this.imgSun = loadImage(this.sunImage);
    }
    

    animate() {
        // Sun movement
        this.sunAnimation();
    }
}