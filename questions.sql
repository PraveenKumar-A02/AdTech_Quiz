CREATE TABLE IF NOT EXISTS question (
    ques_id BIGINT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    optionA VARCHAR(255) NOT NULL,
    optionB VARCHAR(255) NOT NULL,
    optionC VARCHAR(255) NOT NULL,
    ans INT NOT NULL,
    chose INT NOT NULL
);

INSERT INTO question (ques_id, title, optionA, optionB, optionC, ans, chose) VALUES
(1, '1. What is the primary goal of brand awareness advertising?', 'Generate direct sales from repeat customers', 'Maximize exposure and engage a broad audience', 'Track user behavior for future targeting', 2, -1),
(2, '2. What does CPM stand for in digital advertising?', 'Cost Per Minute', 'Clicks Per Metric', 'Cost Per Mille (thousand impressions)', 3, -1),
(3, '3. What is the role of an ad server in AdTech?', 'To store video files for streaming', 'To manage, deliver, and measure online ad campaigns', 'To block irrelevant content', 2, -1),
(4, '4. Which platform allows advertisers to buy media on an impression-by-impression basis via RTB?', 'Ad Network', 'Demand-Side Platform (DSP)', 'Data Management Platform (DMP)', 2, -1),
(5, '5. What are the three main types of ad inventory?', 'Organic, Paid, Sponsored', 'Premium, Remnant, Long-Tail', 'Native, Banner, Interstitial', 2, -1),
(6, '6. Which pricing model is based on user action such as a sale or sign-up?', 'Cost Per Mille (CPM)', 'Cost Per Action/Acquisition (CPA)', 'Cost Per Click (CPC)', 2, -1),
(7, '7. What does a DMP (Data Management Platform) primarily do?', 'Hosts video ads', 'Collects, organizes, and activates audience data', 'Handles billing for ad campaigns', 2, -1),
(8, '8. What is a “viewable impression” according to IAB standards?', 'An impression counted for all ads loaded on a page', 'An impression only if 50% of the ad is in view for 1 second', 'An impression where the ad is clicked', 2, -1),
(9, '9. What was the first-ever form of online display advertising?', 'Pop-up ads on Yahoo', 'A banner ad on HotWired by AT&T in 1994', 'Google Search ads', 2, -1),
(10, '10. What is the main function of a Supply-Side Platform (SSP)?', 'To help publishers sell ad inventory across exchanges', 'To manage creative designs for ads', 'To track user activity across mobile apps', 1, -1);
