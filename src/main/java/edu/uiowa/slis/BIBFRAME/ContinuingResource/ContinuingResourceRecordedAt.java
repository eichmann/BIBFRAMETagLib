package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceRecordedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceRecordedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceRecordedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceRecordedAtIterator theContinuingResourceRecordedAtIterator = (ContinuingResourceRecordedAtIterator)findAncestorWithClass(this, ContinuingResourceRecordedAtIterator.class);
			pageContext.getOut().print(theContinuingResourceRecordedAtIterator.getRecordedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for recordedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for recordedAt tag ");
		}
		return SKIP_BODY;
	}
}

