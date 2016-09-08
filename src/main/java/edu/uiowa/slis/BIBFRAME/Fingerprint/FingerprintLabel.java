package edu.uiowa.slis.BIBFRAME.Fingerprint;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FingerprintLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FingerprintLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FingerprintLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Fingerprint theFingerprint = (Fingerprint)findAncestorWithClass(this, Fingerprint.class);
			if (!theFingerprint.commitNeeded) {
				pageContext.getOut().print(theFingerprint.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Fingerprint for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fingerprint for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Fingerprint theFingerprint = (Fingerprint)findAncestorWithClass(this, Fingerprint.class);
			return theFingerprint.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Fingerprint for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fingerprint for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Fingerprint theFingerprint = (Fingerprint)findAncestorWithClass(this, Fingerprint.class);
			theFingerprint.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Fingerprint for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fingerprint for label tag ");
		}
	}
}

