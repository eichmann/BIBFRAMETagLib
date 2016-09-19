package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasTitleIterator theContinuingResourceHasTitleIterator = (ContinuingResourceHasTitleIterator)findAncestorWithClass(this, ContinuingResourceHasTitleIterator.class);
			pageContext.getOut().print(theContinuingResourceHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

