package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileIssuedWithInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileIssuedWithInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileIssuedWithInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileIssuedWithInverseIterator theTactileIssuedWithInverseIterator = (TactileIssuedWithInverseIterator)findAncestorWithClass(this, TactileIssuedWithInverseIterator.class);
			pageContext.getOut().print(theTactileIssuedWithInverseIterator.getIssuedWithInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for issuedWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for issuedWith tag ");
		}
		return SKIP_BODY;
	}
}

