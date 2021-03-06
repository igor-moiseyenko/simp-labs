(ns simp-labs.lab4.walking-01-test
  (:require [clojure.test :refer :all]
            [simp-labs.lab4.walking-01 :refer :all]
            [simp-labs.lab4.test-utils :as u]))

(def ram-size 4)

; Walking 0/1 Tests: SAF

(deftest walking-01-saf-0-test
  (testing "Walking 0/1 SAF0"
    (let [rams (u/initSAFRams ram-size 0)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "SAF0" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-saf-1-test
  (testing "Walking 0/1 SAF1"
    (let [rams (u/initSAFRams ram-size 1)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "SAF1" (u/error-detection-probability actual (count rams))))))

; Walking 0/1 Tests: CFin

(deftest walking-01-CFin-L-01-test
  (testing "walking 0/1 CFin ∧〈↑,aj〉"
    (let [rams (u/initAllCFinL01Rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFin ∧〈↑,aj〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFin-G-01-test
  (testing "walking 0/1 CFin ∨〈↑,aj〉"
    (let [rams (u/initAllCFinG01Rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFin ∨〈↑,aj〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFin-L-10-test
  (testing "walking 0/1 CFin ∧〈↓,aj〉"
    (let [rams (u/initAllCFinL10Rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFin ∧〈↓,aj〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFin-G-10-test
  (testing "walking 0/1 CFin ∨〈↓,aj〉"
    (let [rams (u/initAllCFinG10Rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFin ∨〈↓,aj〉" (u/error-detection-probability actual (count rams))))))

; Walking 0/1 Tests: CFid

(deftest walking-01-CFid-L-01-0-test
  (testing "walking 0/1 CFid ∧〈↑,0〉"
    (let [rams (u/initAllCFidL01-0-rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFid ∧〈↑,0〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFid-L-01-1-test
  (testing "walking 0/1 CFid ∧〈↑,1〉"
    (let [rams (u/initAllCFidL01-1-rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFid ∧〈↑,1〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFid-L-10-0-test
  (testing "walking 0/1 CFid ∧〈↓,0〉"
    (let [rams (u/initAllCFidL10-0-rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFid ∧〈↓,0〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFid-L-10-1-test
  (testing "walking 0/1 CFid ∧〈↓,1〉"
    (let [rams (u/initAllCFidL10-1-rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFid ∧〈↓,1〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFid-G-01-0-test
  (testing "walking 0/1 CFid ∨〈↑,0〉"
    (let [rams (u/initAllCFidG01-0-rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFid ∨〈↑,0〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFid-G-01-1-test
  (testing "walking 0/1 CFid ∨〈↑,1〉"
    (let [rams (u/initAllCFidG01-1-rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFid ∨〈↑,1〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFid-G-10-0-test
  (testing "walking 0/1 CFid ∨〈↓,0〉"
    (let [rams (u/initAllCFidG10-0-rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFid ∨〈↓,0〉" (u/error-detection-probability actual (count rams))))))

(deftest walking-01-CFid-G-10-1-test
  (testing "walking 0/1 CFid ∨〈↓,1〉"
    (let [rams (u/initAllCFidG10-1-rams ram-size)
          actual (map run-01 rams)]
      (u/print-test-report "Walking 0/1" "CFid ∨〈↓,1〉" (u/error-detection-probability actual (count rams))))))
