fun main() {
    val signalcase_1 = Signal(56, 89, 25, 6, 11)
    check(Policy.score(signalcase_1) == 149)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(68, 104, 17, 19, 11)
    check(Policy.score(signalcase_2) == 152)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(89, 86, 15, 14, 8)
    check(Policy.score(signalcase_3) == 194)
    check(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(46, 22, 32, 46)
    check(DomainReviewLens.score(domainReview) == 64)
    check(DomainReviewLens.lane(domainReview) == "hold")
}
