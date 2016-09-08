package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceRelationIterator theContinuingResourceRelationIterator = (ContinuingResourceRelationIterator)findAncestorWithClass(this, ContinuingResourceRelationIterator.class);
			pageContext.getOut().print(theContinuingResourceRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for relation tag ");
		}
		return SKIP_BODY;
	}
}

