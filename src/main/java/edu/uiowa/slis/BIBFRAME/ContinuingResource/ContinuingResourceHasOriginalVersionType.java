package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasOriginalVersionIterator theContinuingResourceHasOriginalVersionIterator = (ContinuingResourceHasOriginalVersionIterator)findAncestorWithClass(this, ContinuingResourceHasOriginalVersionIterator.class);
			pageContext.getOut().print(theContinuingResourceHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

