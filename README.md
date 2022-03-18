# GreatestCommonDivisor_LeastCommonMultiple
 A program that calculates the greatest common divisor and least common multiple of 2 numbers requested as input from the user.


# GREATEST COMMON DIVISOR(GCD)

## Definition

The greatest common divisor (GCD) of two nonzero integers a and b is the greatest positive integer d such that d is a divisor of both a and b; that is, there are integers e and f such that a = de and b = df, and d is the largest such integer. The GCD of a and b is generally denoted gcd(a, b).

This definition also applies when one of a and b is zero. In this case, the GCD is the absolute value of the non zero integer: gcd(a, 0) = gcd(0, a) = |a|. This case is important as the terminating step of the Euclidean algorithm.

The above definition cannot be used for defining gcd(0, 0), since 0 × n = 0, and zero thus has no greatest divisor. However, zero is its own greatest divisor if greatest is understood in the context of the divisibility relation, so gcd(0, 0) is commonly defined as 0. This preserves the usual identities for GCD, and in particular Bézout's identity, namely that gcd(a, b) generates the same ideal as {a, b}. This convention is followed by many computer algebra systems. Nonetheless, some authors leave gcd(0, 0) undefined.

The GCD of a and b is their greatest positive common divisor in the preorder relation of divisibility. This means that the common divisors of a and b are exactly the divisors of their GCD. This is commonly proved by using either Euclid's lemma, the fundamental theorem of arithmetic, or the Euclidean algorithm. This is the meaning of "greatest" that is used for the generalizations of the concept of GCD.

## Examples
The number 54 can be expressed as a product of two integers in several different ways:

![img](https://wikimedia.org/api/rest_v1/media/math/render/svg/b824c653ddb99429e1bde40a1f7a6fdc030e5a63)

Thus the complete list of divisors of 54 is:


![img](https://wikimedia.org/api/rest_v1/media/math/render/svg/e2ea0258f6a8481d696ee692658f662d91cec28e)


Similarly, the divisors of 24 are:

![img](https://wikimedia.org/api/rest_v1/media/math/render/svg/6ffce6b8781807850c4708db45e76287bc425ec4)


The numbers that these two lists have in common are the common divisors of 54 and 24, that is:

![img](https://wikimedia.org/api/rest_v1/media/math/render/svg/cd97bd0c5025be0e55344e034e8a686c037dbd9b)


Of these, the greatest is 6, so it is the greatest common divisor:

![img](https://wikimedia.org/api/rest_v1/media/math/render/svg/e1332ce77770f0b303274b18ed947ddf0b2ea179)


Computing all divisors of the two numbers in this way is usually not efficient, especially for large numbers that have many divisors.

[GCD](https://en.wikipedia.org/wiki/Greatest_common_divisor)



# LEAST COMMON MULTIPER (LCM)

## Definition


In arithmetic and number theory, the least common multiple, lowest common multiple, or smallest common multiple of two integers a and b, usually denoted by lcm(a, b), is the smallest positive integer that is divisible by both a and b.[1][2] Since division of integers by zero is undefined, this definition has meaning only if a and b are both different from zero.[3] However, some authors define lcm(a,0) as 0 for all a, since 0 is the only common multiple of a and 0.

The lcm is the "lowest common denominator" (lcd) that can be used before fractions can be added, subtracted or compared.

The least common multiple of more than two integers a, b, c, . . . , usually denoted by lcm(a, b, c, . . .), is also well defined: It is the smallest positive integer that is divisible by each of a, b, c, . . .


## Examples
![Image](https://wikimedia.org/api/rest_v1/media/math/render/svg/4d0d15e4f2608490a8dcef8a18aa1490758e24d7)

Multiples of 4 are:

![Image](https://wikimedia.org/api/rest_v1/media/math/render/svg/1d6a7e53abeb2d251fb40cc859f2039bd1bd20ed)

Multiples of 6 are:

![Image](https://wikimedia.org/api/rest_v1/media/math/render/svg/4ad074818ce60fe4fe64568daa9717564b1310f3)

Common multiples of 4 and 6 are the numbers that are in both lists:

![Image](https://wikimedia.org/api/rest_v1/media/math/render/svg/e103dc5460d8c12cb9654854601bbb01d0f33ec5)

In this list, the smallest number is 12. Hence, the least common multiple is 12.

[LCM](https://en.wikipedia.org/wiki/Least_common_multiple)
