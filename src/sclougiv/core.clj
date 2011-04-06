(ns sclougiv.core
  (:use midje.sweet)
  (:use clj-webdriver.core))

;;midje

  (def b (start :firefox "https://github.com"))

  (-> b
    (find-it {:text "Login"})
    click)

  (fact (let [testvardet (-> b
			   (find-it {:xpath "//a[text()='Blog']"}))]
	  (count (list testvardet)) => 1
	  (count (list testvardet)) => 2))

