package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasSupplement extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasSupplement currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasSupplement.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasSupplementIterator theDissertationHasSupplementIterator = (DissertationHasSupplementIterator)findAncestorWithClass(this, DissertationHasSupplementIterator.class);
			pageContext.getOut().print(theDissertationHasSupplementIterator.getHasSupplement());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

