package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileIssuedWithType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileIssuedWithType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileIssuedWithType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileIssuedWithIterator theTactileIssuedWithIterator = (TactileIssuedWithIterator)findAncestorWithClass(this, TactileIssuedWithIterator.class);
			pageContext.getOut().print(theTactileIssuedWithIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for issuedWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for issuedWith tag ");
		}
		return SKIP_BODY;
	}
}

