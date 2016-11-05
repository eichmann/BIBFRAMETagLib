package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceRelationIterator theIntegratingResourceRelationIterator = (IntegratingResourceRelationIterator)findAncestorWithClass(this, IntegratingResourceRelationIterator.class);
			pageContext.getOut().print(theIntegratingResourceRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for relation tag ");
		}
		return SKIP_BODY;
	}
}

