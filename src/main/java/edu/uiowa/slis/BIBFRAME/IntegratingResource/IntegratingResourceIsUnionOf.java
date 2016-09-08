package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceIsUnionOfIterator theIntegratingResourceIsUnionOfIterator = (IntegratingResourceIsUnionOfIterator)findAncestorWithClass(this, IntegratingResourceIsUnionOfIterator.class);
			pageContext.getOut().print(theIntegratingResourceIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

