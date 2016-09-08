package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasOtherEditionIterator theContinuingResourceHasOtherEditionIterator = (ContinuingResourceHasOtherEditionIterator)findAncestorWithClass(this, ContinuingResourceHasOtherEditionIterator.class);
			pageContext.getOut().print(theContinuingResourceHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

