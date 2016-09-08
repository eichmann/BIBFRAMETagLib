package edu.uiowa.slis.BIBFRAME.Fingerprint;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FingerprintIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FingerprintIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(FingerprintIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FingerprintIdentifiesIterator theFingerprintIdentifiesIterator = (FingerprintIdentifiesIterator)findAncestorWithClass(this, FingerprintIdentifiesIterator.class);
			pageContext.getOut().print(theFingerprintIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Fingerprint for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Fingerprint for identifies tag ");
		}
		return SKIP_BODY;
	}
}

