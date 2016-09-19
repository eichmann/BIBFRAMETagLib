package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasOriginalVersionInverseIterator theIntegratingResourceHasOriginalVersionInverseIterator = (IntegratingResourceHasOriginalVersionInverseIterator)findAncestorWithClass(this, IntegratingResourceHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

