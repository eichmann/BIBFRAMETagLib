package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceRelationIterator theInstanceRelationIterator = (InstanceRelationIterator)findAncestorWithClass(this, InstanceRelationIterator.class);
			pageContext.getOut().print(theInstanceRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for relation tag ");
		}
		return SKIP_BODY;
	}
}

