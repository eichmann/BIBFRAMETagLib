package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntityRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntityRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntityRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TemporalEntityRelationInverseIterator theTemporalEntityRelationInverseIterator = (TemporalEntityRelationInverseIterator)findAncestorWithClass(this, TemporalEntityRelationInverseIterator.class);
			pageContext.getOut().print(theTemporalEntityRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for relation tag ");
		}
		return SKIP_BODY;
	}
}

