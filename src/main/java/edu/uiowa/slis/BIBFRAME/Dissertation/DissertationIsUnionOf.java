package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationIsUnionOfIterator theDissertationIsUnionOfIterator = (DissertationIsUnionOfIterator)findAncestorWithClass(this, DissertationIsUnionOfIterator.class);
			pageContext.getOut().print(theDissertationIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

