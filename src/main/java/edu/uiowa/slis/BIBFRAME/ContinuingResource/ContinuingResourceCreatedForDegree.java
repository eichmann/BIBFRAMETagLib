package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceCreatedForDegreeIterator theContinuingResourceCreatedForDegreeIterator = (ContinuingResourceCreatedForDegreeIterator)findAncestorWithClass(this, ContinuingResourceCreatedForDegreeIterator.class);
			pageContext.getOut().print(theContinuingResourceCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

