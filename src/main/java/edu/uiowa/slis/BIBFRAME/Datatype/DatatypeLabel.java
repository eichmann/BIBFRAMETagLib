package edu.uiowa.slis.BIBFRAME.Datatype;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypeLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DatatypeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Datatype theDatatype = (Datatype)findAncestorWithClass(this, Datatype.class);
			if (!theDatatype.commitNeeded) {
				pageContext.getOut().print(theDatatype.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Datatype for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Datatype for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Datatype theDatatype = (Datatype)findAncestorWithClass(this, Datatype.class);
			return theDatatype.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Datatype for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Datatype for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Datatype theDatatype = (Datatype)findAncestorWithClass(this, Datatype.class);
			theDatatype.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Datatype for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Datatype for label tag ");
		}
	}
}

