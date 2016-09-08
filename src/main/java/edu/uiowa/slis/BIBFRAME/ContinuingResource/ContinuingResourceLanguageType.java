package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceLanguageIterator theContinuingResourceLanguageIterator = (ContinuingResourceLanguageIterator)findAncestorWithClass(this, ContinuingResourceLanguageIterator.class);
			pageContext.getOut().print(theContinuingResourceLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for language tag ");
		}
		return SKIP_BODY;
	}
}

