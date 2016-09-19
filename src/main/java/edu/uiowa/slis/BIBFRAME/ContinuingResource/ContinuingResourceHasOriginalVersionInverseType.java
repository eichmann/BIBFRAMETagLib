package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasOriginalVersionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasOriginalVersionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasOriginalVersionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasOriginalVersionInverseIterator theContinuingResourceHasOriginalVersionInverseIterator = (ContinuingResourceHasOriginalVersionInverseIterator)findAncestorWithClass(this, ContinuingResourceHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theContinuingResourceHasOriginalVersionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

