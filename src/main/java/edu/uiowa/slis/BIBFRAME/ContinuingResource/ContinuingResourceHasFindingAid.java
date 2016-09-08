package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceHasFindingAid extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceHasFindingAid currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceHasFindingAid.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceHasFindingAidIterator theContinuingResourceHasFindingAidIterator = (ContinuingResourceHasFindingAidIterator)findAncestorWithClass(this, ContinuingResourceHasFindingAidIterator.class);
			pageContext.getOut().print(theContinuingResourceHasFindingAidIterator.getHasFindingAid());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for hasFindingAid tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for hasFindingAid tag ");
		}
		return SKIP_BODY;
	}
}

