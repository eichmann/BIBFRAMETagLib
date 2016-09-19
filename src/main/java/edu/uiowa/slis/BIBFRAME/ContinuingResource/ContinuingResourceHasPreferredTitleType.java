package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasPreferredTitleIterator theContinuingResourceHasPreferredTitleIterator = (ContinuingResourceHasPreferredTitleIterator)findAncestorWithClass(this, ContinuingResourceHasPreferredTitleIterator.class);
			pageContext.getOut().print(theContinuingResourceHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

