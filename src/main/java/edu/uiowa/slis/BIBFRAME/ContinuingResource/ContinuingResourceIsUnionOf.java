package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIsUnionOfIterator theContinuingResourceIsUnionOfIterator = (ContinuingResourceIsUnionOfIterator)findAncestorWithClass(this, ContinuingResourceIsUnionOfIterator.class);
			pageContext.getOut().print(theContinuingResourceIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

