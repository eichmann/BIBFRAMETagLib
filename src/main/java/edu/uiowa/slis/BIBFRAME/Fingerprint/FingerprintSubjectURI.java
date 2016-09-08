package edu.uiowa.slis.BIBFRAME.Fingerprint;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FingerprintSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FingerprintSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FingerprintSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Fingerprint theFingerprint = (Fingerprint)findAncestorWithClass(this, Fingerprint.class);
			if (!theFingerprint.commitNeeded) {
				pageContext.getOut().print(theFingerprint.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Fingerprint for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fingerprint for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Fingerprint theFingerprint = (Fingerprint)findAncestorWithClass(this, Fingerprint.class);
			return theFingerprint.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Fingerprint for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fingerprint for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Fingerprint theFingerprint = (Fingerprint)findAncestorWithClass(this, Fingerprint.class);
			theFingerprint.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Fingerprint for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fingerprint for subjectURI tag ");
		}
	}
}

