package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceIsFindingAidForType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceIsFindingAidForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceIsFindingAidForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceIsFindingAidForIterator theContinuingResourceIsFindingAidForIterator = (ContinuingResourceIsFindingAidForIterator)findAncestorWithClass(this, ContinuingResourceIsFindingAidForIterator.class);
			pageContext.getOut().print(theContinuingResourceIsFindingAidForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for isFindingAidFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for isFindingAidFor tag ");
		}
		return SKIP_BODY;
	}
}

