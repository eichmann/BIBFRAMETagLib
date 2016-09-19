package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasOtherEditionInverseIterator theContinuingResourceHasOtherEditionInverseIterator = (ContinuingResourceHasOtherEditionInverseIterator)findAncestorWithClass(this, ContinuingResourceHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theContinuingResourceHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

