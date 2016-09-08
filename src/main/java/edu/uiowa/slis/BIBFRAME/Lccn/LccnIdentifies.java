package edu.uiowa.slis.BIBFRAME.Lccn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccnIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccnIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(LccnIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LccnIdentifiesIterator theLccnIdentifiesIterator = (LccnIdentifiesIterator)findAncestorWithClass(this, LccnIdentifiesIterator.class);
			pageContext.getOut().print(theLccnIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing Lccn for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lccn for identifies tag ");
		}
		return SKIP_BODY;
	}
}

