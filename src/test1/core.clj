(ns test1.core)

;zaokruzivanje na 2 decimale
(defn round2 [x]
  (/ (Math/round (* x 100.0)) 100.0))

;"Izracunavanje OIE (obnovljivi izvori energije)."
(defn OIE [x]
  (round2 (* x 0.093)))

;izracunavanje cene potrosene ee
(defn EE [x]
  (if (> x 1600)
    (+ (* (- x 1600) 15.33) (* 1250 7.666) (* 350 5.11))
    (if (> x 350)
      (+ (* (- x 350) 7.666) (* 350 5.11))
      (* x 5.11))))

;naknada za trosak javnog snabdevaca fiksna u zavisnosti od mesta isporuke

;obracunska snaga - malo komplikovanije, zavisi od mesecne odobrene snage i placa se po kW

;akciza 7.5%

;pdv 20%

;JMS 150 RSD (javni medijski servis)

