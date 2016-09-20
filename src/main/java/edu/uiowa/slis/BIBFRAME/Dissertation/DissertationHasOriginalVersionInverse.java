package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasOriginalVersionInverseIterator theDissertationHasOriginalVersionInverseIterator = (DissertationHasOriginalVersionInverseIterator)findAncestorWithClass(this, DissertationHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theDissertationHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

